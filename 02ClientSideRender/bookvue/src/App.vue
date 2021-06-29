

<template>
  <h1>Flim List</h1>
  <FlimList :flims="flims" />
</template>

<script>
import FlimList from './components/FlimList.vue'
import axios from "axios"
export default {
  components: {
    FlimList,
  },
  data() {
    return {
      flims: [],
      loading: false,
      error: null,
    }
  },
  methods: {    
    async fetchFlims() {
      try {
        this.error = null
        this.loading = true
        const url = `http://localhost:8080/api/Flims`
        const response = await axios.get(url)       
        this.Flims = response.data
      } catch (err) {       
        console.log(err)
      }
      this.loading = false
    },
  },
  mounted() {
    this.fetchFlims()
  },

}
</script>

<style>
#app {
  font-family: "SF Mono", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: left;
  color: #2c3e50;
  margin-top: 20px;
}
</style>
