import axios from "axios";

export default function useDeleteStudents(id) {
  axios.delete("http://localhost:8080/student/delete/" + (id))
  .then((res) => console.log(res))
}