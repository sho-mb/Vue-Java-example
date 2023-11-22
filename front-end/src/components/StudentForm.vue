<script setup>
import { ref } from 'vue'
import { usePostStudent } from '../composables/postStudent.js'

const postData = ref({"firstname":"", "lastname":""})
const createPost = () => {
  usePostStudent(postData.value)
}

</script>
<template>
  <form @submit="createPost">
    <div>
      <label for="firstname">Firstname</label>
      <input type="text" id="firstname" v-model="postData.firstname">
    </div>
    <div>
      <label for="lastname">Lastname</label>
      <input type="text" id="lastname" v-model="postData.lastname">
    </div>
    <button type="submit">Submit</button>
  </form>
</template>