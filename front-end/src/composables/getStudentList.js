import axios from 'axios'
import { onMounted, ref } from 'vue'

export default function useGetStudent() {
  const students = ref([])

  onMounted(() => {
    getStudentList()
  })

  const getStudentList = async () => {
    axios.get("http://localhost:8080/student")
    .then(response => {
      students.value = response.data
      console.log(response.data)
    })
  }

  return { students }
}