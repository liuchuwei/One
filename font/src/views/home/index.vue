<template>
  <div style="display: flex">

  <div>
    <el-card style="width: 640px; height: 280px">
      <template #header>
        <div class="card-header">
          <span>多看新闻</span>
        </div>
      </template>
    </el-card>

    <el-card style="width: 640px; height: 280px; margin-top: 10px">
      <template #header>
        <div class="card-header">
          <span>多去搬砖</span>
        </div>
      </template>
    </el-card>

  </div>
  <Calendar style="margin-left: auto"/>
  <span style="color: white">>>></span>
  </div>
</template>

<script>
import Calendar from './Home.vue'
import { useCalendarStore } from '@/store/calender.js';
import { toRefs } from 'vue';

export default {
  components: {Calendar},
  setup() {
    const calendarStore = useCalendarStore();

    const calendarState = toRefs(calendarStore);

    const getEventsForDate = (date) => {
      return calendarState.events.value.filter((eventinfo) => {
        const eventDate = new Date(eventinfo.date);
        const providedDate = new Date(date);

        return eventDate.toLocaleDateString() === providedDate.toLocaleDateString();
      });
    };

    return {
      ...calendarState,
      getEventsForDate,
      saveEventData: calendarStore.saveEventData,
      loadEventData: calendarStore.loadEventData,
    };
  },
  mounted() {
    this.loadEventData();
  },
  beforeUnmount() {
    window.removeEventListener('beforeunload', this.saveEventData);
  },
}

</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=Poppins&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Playfair&display=swap');
@import '@/assets/css/color.css';
@import '@/assets/css/common.css';

body{
  /* background-color: var(--paper-background); */
  font-family: Poppins, Playfair, Switzer, Inter, DM Sans, Mona Sans, Arial, sans-serif;
  font-size: 22px;
  overflow-x: hidden;
}


</style>
