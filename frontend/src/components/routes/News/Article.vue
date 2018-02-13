<template>
  <div class="card" style="width: 18rem;">
    <div class="card-body">
      <h5 class="card-title">{{ title }}</h5>
      <p class="card-text">{{ text }}</p>
    </div>
  </div>
</template>

<script>
/* eslint-disable */
export default {
  name: 'shobbulo',
  props: {
    title: {
      type: String,
      default: null
    },
    text: {
      type: String,
      default: null
    }
  }
}
</script>

<style scoped>

</style>
