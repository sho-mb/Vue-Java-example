<script setup>
import StudentForm from './components/StudentForm.vue';
import StudentList from './components/StudentList.vue';

</script>
<template>
  <header>
  </header>
  <main>
    <h1 class="mainTitle">Composable / Composition API with Jave spring boot example</h1>
    <div class="container">
      <div>
        <StudentForm />
      </div>
      <div class="list">
        <StudentList />
      </div>
    </div>
  </main>
</template>

<style scoped>
.mainTitle{
  margin-bottom: 160px;
  font-size: 40px;
}
.container{
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100%;
}

.list{
  display: flex;
  justify-content: center;
  align-items: center;
}

</style>
