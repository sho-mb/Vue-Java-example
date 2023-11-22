import axios from "axios"

export function usePostStudent(data) {  
  console.log(data)
  axios.post("http://localhost:8080/student/add", data)
  .then((res) => console.log(res))
  .catch((error) => console.log(error))
}