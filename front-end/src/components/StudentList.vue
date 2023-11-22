<script setup>
import { computed, ref } from "vue";
import useStudent from "../composables/getStudentList.js";
import useDeleteStudent from "../composables/deleteStudent.js"

const { students } = useStudent();

const serach = ref("");

const computedList = computed(() => {
  return students.value.filter(
    (student) =>
      student.firstname.toLowerCase().includes(serach.value.toLowerCase()) ||
      student.lastname.toLowerCase().includes(serach.value.toLowerCase())
  );
});

function remove(id) {
  useDeleteStudent(id)
  students.value = students.value.filter(student => student.id !== id);
}

</script>
<template>
  <div class="box">
    <input class="search-box" type="text" v-model="serach" />
    <p>You input : {{ serach }}</p>
  </div>
  <TransitionGroup name="list" tag="ul">
    <li v-for="student in computedList" :key="student.id">
      {{ student.firstname }} {{ student.lastname }}
      <button @click="remove(student.id)">Delete</button>
    </li>
  </TransitionGroup>
</template>
<style>
/* Transion group. this list ref to name='list' */
.list-move,
.list-enter-active,
.list-leave-active {
  transition: all 0.5s ease;
}

.list-leave-active {
  position: absolute;
}

.list-enter-from,
.list-leave-to {
  transition: all 0.5s ease;
  opacity: 0;
}

/* css */
.box {
  margin-left: 16px;
}

.search-box {
  width: 240px;
  height: 24px;
}
</style>