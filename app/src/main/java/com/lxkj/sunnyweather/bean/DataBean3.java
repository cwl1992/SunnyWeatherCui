package com.lxkj.sunnyweather.bean;

import java.io.Serializable;
import java.util.List;

@lombok.Data
public class DataBean3 implements Serializable {


    /**
     * api_status : active
     * api_version : v2.5
     * lang : zh_CN
     * location : [25.1552,121.6544]
     * result : {"daily":{"air_quality":{"aqi":[{"avg":{"chn":7.86,"usa":7.86},"date":"2021-05-29T00:00+08:00","max":{"chn":13,"usa":13},"min":{"chn":7,"usa":7}},{"avg":{"chn":7.58,"usa":7.58},"date":"2021-05-30T00:00+08:00","max":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}},{"avg":{"chn":7.5,"usa":7.5},"date":"2021-05-31T00:00+08:00","max":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}},{"avg":{"chn":7.67,"usa":7.67},"date":"2021-06-01T00:00+08:00","max":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}},{"avg":{"chn":7.42,"usa":7.42},"date":"2021-06-02T00:00+08:00","max":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}}],"pm25":[{"avg":6,"date":"2021-05-29T00:00+08:00","max":7,"min":3},{"avg":4.71,"date":"2021-05-30T00:00+08:00","max":6,"min":3},{"avg":5.04,"date":"2021-05-31T00:00+08:00","max":6,"min":4},{"avg":4.62,"date":"2021-06-01T00:00+08:00","max":5,"min":4},{"avg":4.71,"date":"2021-06-02T00:00+08:00","max":6,"min":4}]},"astro":[{"date":"2021-05-29T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:37"}},{"date":"2021-05-30T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:38"}},{"date":"2021-05-31T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:38"}},{"date":"2021-06-01T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:39"}},{"date":"2021-06-02T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:39"}}],"cloudrate":[{"avg":0.97,"date":"2021-05-29T00:00+08:00","max":1,"min":0.9},{"avg":1,"date":"2021-05-30T00:00+08:00","max":1,"min":1},{"avg":0.99,"date":"2021-05-31T00:00+08:00","max":1,"min":0.89},{"avg":0.88,"date":"2021-06-01T00:00+08:00","max":1,"min":0.47},{"avg":0.94,"date":"2021-06-02T00:00+08:00","max":1,"min":0.65}],"dswrf":[{"avg":27.8,"date":"2021-05-29T00:00+08:00","max":288.2,"min":0},{"avg":27.4,"date":"2021-05-30T00:00+08:00","max":111.8,"min":0},{"avg":19.5,"date":"2021-05-31T00:00+08:00","max":62.5,"min":0},{"avg":255.9,"date":"2021-06-01T00:00+08:00","max":737.9,"min":0},{"avg":211.1,"date":"2021-06-02T00:00+08:00","max":725.1,"min":0}],"humidity":[{"avg":0.83,"date":"2021-05-29T00:00+08:00","max":0.92,"min":0.52},{"avg":0.93,"date":"2021-05-30T00:00+08:00","max":0.97,"min":0.86},{"avg":0.92,"date":"2021-05-31T00:00+08:00","max":0.95,"min":0.88},{"avg":0.82,"date":"2021-06-01T00:00+08:00","max":0.88,"min":0.72},{"avg":0.83,"date":"2021-06-02T00:00+08:00","max":0.9,"min":0.72}],"life_index":{"carWashing":[{"date":"2021-05-29T00:00+08:00","desc":"较不适宜","index":"3"},{"date":"2021-05-30T00:00+08:00","desc":"较不适宜","index":"3"},{"date":"2021-05-31T00:00+08:00","desc":"较不适宜","index":"3"},{"date":"2021-06-01T00:00+08:00","desc":"较不适宜","index":"3"},{"date":"2021-06-02T00:00+08:00","desc":"较不适宜","index":"3"}],"coldRisk":[{"date":"2021-05-29T00:00+08:00","desc":"极易发","index":"4"},{"date":"2021-05-30T00:00+08:00","desc":"易发","index":"3"},{"date":"2021-05-31T00:00+08:00","desc":"易发","index":"3"},{"date":"2021-06-01T00:00+08:00","desc":"易发","index":"3"},{"date":"2021-06-02T00:00+08:00","desc":"易发","index":"3"}],"comfort":[{"date":"2021-05-29T00:00+08:00","desc":"热","index":"3"},{"date":"2021-05-30T00:00+08:00","desc":"热","index":"3"},{"date":"2021-05-31T00:00+08:00","desc":"热","index":"3"},{"date":"2021-06-01T00:00+08:00","desc":"热","index":"3"},{"date":"2021-06-02T00:00+08:00","desc":"热","index":"3"}],"dressing":[{"date":"2021-05-29T00:00+08:00","desc":"很热","index":"2"},{"date":"2021-05-30T00:00+08:00","desc":"热","index":"3"},{"date":"2021-05-31T00:00+08:00","desc":"热","index":"3"},{"date":"2021-06-01T00:00+08:00","desc":"很热","index":"2"},{"date":"2021-06-02T00:00+08:00","desc":"很热","index":"2"}],"ultraviolet":[{"date":"2021-05-29T00:00+08:00","desc":"最弱","index":"1"},{"date":"2021-05-30T00:00+08:00","desc":"最弱","index":"1"},{"date":"2021-05-31T00:00+08:00","desc":"最弱","index":"1"},{"date":"2021-06-01T00:00+08:00","desc":"最弱","index":"1"},{"date":"2021-06-02T00:00+08:00","desc":"最弱","index":"1"}]},"precipitation":[{"avg":0.656,"date":"2021-05-29T00:00+08:00","max":2.1625,"min":0},{"avg":1.6236,"date":"2021-05-30T00:00+08:00","max":6.5808,"min":0},{"avg":2.8782,"date":"2021-05-31T00:00+08:00","max":16.1641,"min":0},{"avg":0.0839,"date":"2021-06-01T00:00+08:00","max":0.3472,"min":0},{"avg":0.3594,"date":"2021-06-02T00:00+08:00","max":2.1368,"min":0}],"pressure":[{"avg":99029.11,"date":"2021-05-29T00:00+08:00","max":99276.23,"min":98925.55},{"avg":98961.02,"date":"2021-05-30T00:00+08:00","max":99196.23,"min":98838.16},{"avg":99063.82,"date":"2021-05-31T00:00+08:00","max":99207.83,"min":98956.23},{"avg":99108.8,"date":"2021-06-01T00:00+08:00","max":99177.15,"min":99005.55},{"avg":99137.51,"date":"2021-06-02T00:00+08:00","max":99257.15,"min":99005.55}],"skycon":[{"date":"2021-05-29T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2021-05-30T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2021-05-31T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2021-06-01T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2021-06-02T00:00+08:00","value":"LIGHT_RAIN"}],"skycon_08h_20h":[{"date":"2021-05-29T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2021-05-30T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2021-05-31T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2021-06-01T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2021-06-02T00:00+08:00","value":"MODERATE_RAIN"}],"skycon_20h_32h":[{"date":"2021-05-29T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2021-05-30T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2021-05-31T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2021-06-01T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2021-06-02T00:00+08:00","value":"LIGHT_RAIN"}],"status":"ok","temperature":[{"avg":27.5,"date":"2021-05-29T00:00+08:00","max":32.16,"min":24},{"avg":25.57,"date":"2021-05-30T00:00+08:00","max":27,"min":24},{"avg":24.54,"date":"2021-05-31T00:00+08:00","max":25.8,"min":24},{"avg":26.35,"date":"2021-06-01T00:00+08:00","max":28,"min":25},{"avg":26.34,"date":"2021-06-02T00:00+08:00","max":28,"min":25}],"visibility":[{"avg":11.6,"date":"2021-05-29T00:00+08:00","max":24.05,"min":7.01},{"avg":9.67,"date":"2021-05-30T00:00+08:00","max":12.31,"min":8.6},{"avg":9.78,"date":"2021-05-31T00:00+08:00","max":11.36,"min":8.89},{"avg":15.08,"date":"2021-06-01T00:00+08:00","max":26.1,"min":11.41},{"avg":14.74,"date":"2021-06-02T00:00+08:00","max":26.05,"min":10.52}],"wind":[{"avg":{"direction":66.88,"speed":7.66},"date":"2021-05-29T00:00+08:00","max":{"direction":0,"speed":15.48},"min":{"direction":54.16,"speed":1.11}},{"avg":{"direction":341.76,"speed":13.37},"date":"2021-05-30T00:00+08:00","max":{"direction":44.28,"speed":31.22},"min":{"direction":261.78,"speed":4.16}},{"avg":{"direction":55.78,"speed":14.91},"date":"2021-05-31T00:00+08:00","max":{"direction":46.89,"speed":18.59},"min":{"direction":117.1,"speed":10.07}},{"avg":{"direction":106.67,"speed":8.01},"date":"2021-06-01T00:00+08:00","max":{"direction":64.12,"speed":11.57},"min":{"direction":158.16,"speed":5.63}},{"avg":{"direction":163.22,"speed":6.41},"date":"2021-06-02T00:00+08:00","max":{"direction":77.97,"speed":10.48},"min":{"direction":156.11,"speed":2.53}}]},"primary":0}
     * server_time : 1622278902
     * status : ok
     * timezone : Asia/Taipei
     * tzshift : 28800
     * unit : metric
     */

    private String api_status;
    private String api_version;
    private String lang;
    private ResultBean result;
    private Integer server_time;
    private String status;
    private String timezone;
    private Integer tzshift;
    private String unit;
    private List<Double> location;

    @lombok.Data
    public static class ResultBean implements Serializable {
        /**
         * daily : {"air_quality":{"aqi":[{"avg":{"chn":7.86,"usa":7.86},"date":"2021-05-29T00:00+08:00","max":{"chn":13,"usa":13},"min":{"chn":7,"usa":7}},{"avg":{"chn":7.58,"usa":7.58},"date":"2021-05-30T00:00+08:00","max":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}},{"avg":{"chn":7.5,"usa":7.5},"date":"2021-05-31T00:00+08:00","max":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}},{"avg":{"chn":7.67,"usa":7.67},"date":"2021-06-01T00:00+08:00","max":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}},{"avg":{"chn":7.42,"usa":7.42},"date":"2021-06-02T00:00+08:00","max":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}}],"pm25":[{"avg":6,"date":"2021-05-29T00:00+08:00","max":7,"min":3},{"avg":4.71,"date":"2021-05-30T00:00+08:00","max":6,"min":3},{"avg":5.04,"date":"2021-05-31T00:00+08:00","max":6,"min":4},{"avg":4.62,"date":"2021-06-01T00:00+08:00","max":5,"min":4},{"avg":4.71,"date":"2021-06-02T00:00+08:00","max":6,"min":4}]},"astro":[{"date":"2021-05-29T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:37"}},{"date":"2021-05-30T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:38"}},{"date":"2021-05-31T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:38"}},{"date":"2021-06-01T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:39"}},{"date":"2021-06-02T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:39"}}],"cloudrate":[{"avg":0.97,"date":"2021-05-29T00:00+08:00","max":1,"min":0.9},{"avg":1,"date":"2021-05-30T00:00+08:00","max":1,"min":1},{"avg":0.99,"date":"2021-05-31T00:00+08:00","max":1,"min":0.89},{"avg":0.88,"date":"2021-06-01T00:00+08:00","max":1,"min":0.47},{"avg":0.94,"date":"2021-06-02T00:00+08:00","max":1,"min":0.65}],"dswrf":[{"avg":27.8,"date":"2021-05-29T00:00+08:00","max":288.2,"min":0},{"avg":27.4,"date":"2021-05-30T00:00+08:00","max":111.8,"min":0},{"avg":19.5,"date":"2021-05-31T00:00+08:00","max":62.5,"min":0},{"avg":255.9,"date":"2021-06-01T00:00+08:00","max":737.9,"min":0},{"avg":211.1,"date":"2021-06-02T00:00+08:00","max":725.1,"min":0}],"humidity":[{"avg":0.83,"date":"2021-05-29T00:00+08:00","max":0.92,"min":0.52},{"avg":0.93,"date":"2021-05-30T00:00+08:00","max":0.97,"min":0.86},{"avg":0.92,"date":"2021-05-31T00:00+08:00","max":0.95,"min":0.88},{"avg":0.82,"date":"2021-06-01T00:00+08:00","max":0.88,"min":0.72},{"avg":0.83,"date":"2021-06-02T00:00+08:00","max":0.9,"min":0.72}],"life_index":{"carWashing":[{"date":"2021-05-29T00:00+08:00","desc":"较不适宜","index":"3"},{"date":"2021-05-30T00:00+08:00","desc":"较不适宜","index":"3"},{"date":"2021-05-31T00:00+08:00","desc":"较不适宜","index":"3"},{"date":"2021-06-01T00:00+08:00","desc":"较不适宜","index":"3"},{"date":"2021-06-02T00:00+08:00","desc":"较不适宜","index":"3"}],"coldRisk":[{"date":"2021-05-29T00:00+08:00","desc":"极易发","index":"4"},{"date":"2021-05-30T00:00+08:00","desc":"易发","index":"3"},{"date":"2021-05-31T00:00+08:00","desc":"易发","index":"3"},{"date":"2021-06-01T00:00+08:00","desc":"易发","index":"3"},{"date":"2021-06-02T00:00+08:00","desc":"易发","index":"3"}],"comfort":[{"date":"2021-05-29T00:00+08:00","desc":"热","index":"3"},{"date":"2021-05-30T00:00+08:00","desc":"热","index":"3"},{"date":"2021-05-31T00:00+08:00","desc":"热","index":"3"},{"date":"2021-06-01T00:00+08:00","desc":"热","index":"3"},{"date":"2021-06-02T00:00+08:00","desc":"热","index":"3"}],"dressing":[{"date":"2021-05-29T00:00+08:00","desc":"很热","index":"2"},{"date":"2021-05-30T00:00+08:00","desc":"热","index":"3"},{"date":"2021-05-31T00:00+08:00","desc":"热","index":"3"},{"date":"2021-06-01T00:00+08:00","desc":"很热","index":"2"},{"date":"2021-06-02T00:00+08:00","desc":"很热","index":"2"}],"ultraviolet":[{"date":"2021-05-29T00:00+08:00","desc":"最弱","index":"1"},{"date":"2021-05-30T00:00+08:00","desc":"最弱","index":"1"},{"date":"2021-05-31T00:00+08:00","desc":"最弱","index":"1"},{"date":"2021-06-01T00:00+08:00","desc":"最弱","index":"1"},{"date":"2021-06-02T00:00+08:00","desc":"最弱","index":"1"}]},"precipitation":[{"avg":0.656,"date":"2021-05-29T00:00+08:00","max":2.1625,"min":0},{"avg":1.6236,"date":"2021-05-30T00:00+08:00","max":6.5808,"min":0},{"avg":2.8782,"date":"2021-05-31T00:00+08:00","max":16.1641,"min":0},{"avg":0.0839,"date":"2021-06-01T00:00+08:00","max":0.3472,"min":0},{"avg":0.3594,"date":"2021-06-02T00:00+08:00","max":2.1368,"min":0}],"pressure":[{"avg":99029.11,"date":"2021-05-29T00:00+08:00","max":99276.23,"min":98925.55},{"avg":98961.02,"date":"2021-05-30T00:00+08:00","max":99196.23,"min":98838.16},{"avg":99063.82,"date":"2021-05-31T00:00+08:00","max":99207.83,"min":98956.23},{"avg":99108.8,"date":"2021-06-01T00:00+08:00","max":99177.15,"min":99005.55},{"avg":99137.51,"date":"2021-06-02T00:00+08:00","max":99257.15,"min":99005.55}],"skycon":[{"date":"2021-05-29T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2021-05-30T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2021-05-31T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2021-06-01T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2021-06-02T00:00+08:00","value":"LIGHT_RAIN"}],"skycon_08h_20h":[{"date":"2021-05-29T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2021-05-30T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2021-05-31T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2021-06-01T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2021-06-02T00:00+08:00","value":"MODERATE_RAIN"}],"skycon_20h_32h":[{"date":"2021-05-29T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2021-05-30T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2021-05-31T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2021-06-01T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2021-06-02T00:00+08:00","value":"LIGHT_RAIN"}],"status":"ok","temperature":[{"avg":27.5,"date":"2021-05-29T00:00+08:00","max":32.16,"min":24},{"avg":25.57,"date":"2021-05-30T00:00+08:00","max":27,"min":24},{"avg":24.54,"date":"2021-05-31T00:00+08:00","max":25.8,"min":24},{"avg":26.35,"date":"2021-06-01T00:00+08:00","max":28,"min":25},{"avg":26.34,"date":"2021-06-02T00:00+08:00","max":28,"min":25}],"visibility":[{"avg":11.6,"date":"2021-05-29T00:00+08:00","max":24.05,"min":7.01},{"avg":9.67,"date":"2021-05-30T00:00+08:00","max":12.31,"min":8.6},{"avg":9.78,"date":"2021-05-31T00:00+08:00","max":11.36,"min":8.89},{"avg":15.08,"date":"2021-06-01T00:00+08:00","max":26.1,"min":11.41},{"avg":14.74,"date":"2021-06-02T00:00+08:00","max":26.05,"min":10.52}],"wind":[{"avg":{"direction":66.88,"speed":7.66},"date":"2021-05-29T00:00+08:00","max":{"direction":0,"speed":15.48},"min":{"direction":54.16,"speed":1.11}},{"avg":{"direction":341.76,"speed":13.37},"date":"2021-05-30T00:00+08:00","max":{"direction":44.28,"speed":31.22},"min":{"direction":261.78,"speed":4.16}},{"avg":{"direction":55.78,"speed":14.91},"date":"2021-05-31T00:00+08:00","max":{"direction":46.89,"speed":18.59},"min":{"direction":117.1,"speed":10.07}},{"avg":{"direction":106.67,"speed":8.01},"date":"2021-06-01T00:00+08:00","max":{"direction":64.12,"speed":11.57},"min":{"direction":158.16,"speed":5.63}},{"avg":{"direction":163.22,"speed":6.41},"date":"2021-06-02T00:00+08:00","max":{"direction":77.97,"speed":10.48},"min":{"direction":156.11,"speed":2.53}}]}
         * primary : 0
         */

        private DailyBean daily;
        private Integer primary;

        @lombok.Data
        public static class DailyBean implements Serializable {
            /**
             * air_quality : {"aqi":[{"avg":{"chn":7.86,"usa":7.86},"date":"2021-05-29T00:00+08:00","max":{"chn":13,"usa":13},"min":{"chn":7,"usa":7}},{"avg":{"chn":7.58,"usa":7.58},"date":"2021-05-30T00:00+08:00","max":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}},{"avg":{"chn":7.5,"usa":7.5},"date":"2021-05-31T00:00+08:00","max":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}},{"avg":{"chn":7.67,"usa":7.67},"date":"2021-06-01T00:00+08:00","max":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}},{"avg":{"chn":7.42,"usa":7.42},"date":"2021-06-02T00:00+08:00","max":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}}],"pm25":[{"avg":6,"date":"2021-05-29T00:00+08:00","max":7,"min":3},{"avg":4.71,"date":"2021-05-30T00:00+08:00","max":6,"min":3},{"avg":5.04,"date":"2021-05-31T00:00+08:00","max":6,"min":4},{"avg":4.62,"date":"2021-06-01T00:00+08:00","max":5,"min":4},{"avg":4.71,"date":"2021-06-02T00:00+08:00","max":6,"min":4}]}
             * astro : [{"date":"2021-05-29T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:37"}},{"date":"2021-05-30T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:38"}},{"date":"2021-05-31T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:38"}},{"date":"2021-06-01T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:39"}},{"date":"2021-06-02T00:00+08:00","sunrise":{"time":"05:03"},"sunset":{"time":"18:39"}}]
             * cloudrate : [{"avg":0.97,"date":"2021-05-29T00:00+08:00","max":1,"min":0.9},{"avg":1,"date":"2021-05-30T00:00+08:00","max":1,"min":1},{"avg":0.99,"date":"2021-05-31T00:00+08:00","max":1,"min":0.89},{"avg":0.88,"date":"2021-06-01T00:00+08:00","max":1,"min":0.47},{"avg":0.94,"date":"2021-06-02T00:00+08:00","max":1,"min":0.65}]
             * dswrf : [{"avg":27.8,"date":"2021-05-29T00:00+08:00","max":288.2,"min":0},{"avg":27.4,"date":"2021-05-30T00:00+08:00","max":111.8,"min":0},{"avg":19.5,"date":"2021-05-31T00:00+08:00","max":62.5,"min":0},{"avg":255.9,"date":"2021-06-01T00:00+08:00","max":737.9,"min":0},{"avg":211.1,"date":"2021-06-02T00:00+08:00","max":725.1,"min":0}]
             * humidity : [{"avg":0.83,"date":"2021-05-29T00:00+08:00","max":0.92,"min":0.52},{"avg":0.93,"date":"2021-05-30T00:00+08:00","max":0.97,"min":0.86},{"avg":0.92,"date":"2021-05-31T00:00+08:00","max":0.95,"min":0.88},{"avg":0.82,"date":"2021-06-01T00:00+08:00","max":0.88,"min":0.72},{"avg":0.83,"date":"2021-06-02T00:00+08:00","max":0.9,"min":0.72}]
             * life_index : {"carWashing":[{"date":"2021-05-29T00:00+08:00","desc":"较不适宜","index":"3"},{"date":"2021-05-30T00:00+08:00","desc":"较不适宜","index":"3"},{"date":"2021-05-31T00:00+08:00","desc":"较不适宜","index":"3"},{"date":"2021-06-01T00:00+08:00","desc":"较不适宜","index":"3"},{"date":"2021-06-02T00:00+08:00","desc":"较不适宜","index":"3"}],"coldRisk":[{"date":"2021-05-29T00:00+08:00","desc":"极易发","index":"4"},{"date":"2021-05-30T00:00+08:00","desc":"易发","index":"3"},{"date":"2021-05-31T00:00+08:00","desc":"易发","index":"3"},{"date":"2021-06-01T00:00+08:00","desc":"易发","index":"3"},{"date":"2021-06-02T00:00+08:00","desc":"易发","index":"3"}],"comfort":[{"date":"2021-05-29T00:00+08:00","desc":"热","index":"3"},{"date":"2021-05-30T00:00+08:00","desc":"热","index":"3"},{"date":"2021-05-31T00:00+08:00","desc":"热","index":"3"},{"date":"2021-06-01T00:00+08:00","desc":"热","index":"3"},{"date":"2021-06-02T00:00+08:00","desc":"热","index":"3"}],"dressing":[{"date":"2021-05-29T00:00+08:00","desc":"很热","index":"2"},{"date":"2021-05-30T00:00+08:00","desc":"热","index":"3"},{"date":"2021-05-31T00:00+08:00","desc":"热","index":"3"},{"date":"2021-06-01T00:00+08:00","desc":"很热","index":"2"},{"date":"2021-06-02T00:00+08:00","desc":"很热","index":"2"}],"ultraviolet":[{"date":"2021-05-29T00:00+08:00","desc":"最弱","index":"1"},{"date":"2021-05-30T00:00+08:00","desc":"最弱","index":"1"},{"date":"2021-05-31T00:00+08:00","desc":"最弱","index":"1"},{"date":"2021-06-01T00:00+08:00","desc":"最弱","index":"1"},{"date":"2021-06-02T00:00+08:00","desc":"最弱","index":"1"}]}
             * precipitation : [{"avg":0.656,"date":"2021-05-29T00:00+08:00","max":2.1625,"min":0},{"avg":1.6236,"date":"2021-05-30T00:00+08:00","max":6.5808,"min":0},{"avg":2.8782,"date":"2021-05-31T00:00+08:00","max":16.1641,"min":0},{"avg":0.0839,"date":"2021-06-01T00:00+08:00","max":0.3472,"min":0},{"avg":0.3594,"date":"2021-06-02T00:00+08:00","max":2.1368,"min":0}]
             * pressure : [{"avg":99029.11,"date":"2021-05-29T00:00+08:00","max":99276.23,"min":98925.55},{"avg":98961.02,"date":"2021-05-30T00:00+08:00","max":99196.23,"min":98838.16},{"avg":99063.82,"date":"2021-05-31T00:00+08:00","max":99207.83,"min":98956.23},{"avg":99108.8,"date":"2021-06-01T00:00+08:00","max":99177.15,"min":99005.55},{"avg":99137.51,"date":"2021-06-02T00:00+08:00","max":99257.15,"min":99005.55}]
             * skycon : [{"date":"2021-05-29T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2021-05-30T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2021-05-31T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2021-06-01T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2021-06-02T00:00+08:00","value":"LIGHT_RAIN"}]
             * skycon_08h_20h : [{"date":"2021-05-29T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2021-05-30T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2021-05-31T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2021-06-01T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2021-06-02T00:00+08:00","value":"MODERATE_RAIN"}]
             * skycon_20h_32h : [{"date":"2021-05-29T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2021-05-30T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2021-05-31T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2021-06-01T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2021-06-02T00:00+08:00","value":"LIGHT_RAIN"}]
             * status : ok
             * temperature : [{"avg":27.5,"date":"2021-05-29T00:00+08:00","max":32.16,"min":24},{"avg":25.57,"date":"2021-05-30T00:00+08:00","max":27,"min":24},{"avg":24.54,"date":"2021-05-31T00:00+08:00","max":25.8,"min":24},{"avg":26.35,"date":"2021-06-01T00:00+08:00","max":28,"min":25},{"avg":26.34,"date":"2021-06-02T00:00+08:00","max":28,"min":25}]
             * visibility : [{"avg":11.6,"date":"2021-05-29T00:00+08:00","max":24.05,"min":7.01},{"avg":9.67,"date":"2021-05-30T00:00+08:00","max":12.31,"min":8.6},{"avg":9.78,"date":"2021-05-31T00:00+08:00","max":11.36,"min":8.89},{"avg":15.08,"date":"2021-06-01T00:00+08:00","max":26.1,"min":11.41},{"avg":14.74,"date":"2021-06-02T00:00+08:00","max":26.05,"min":10.52}]
             * wind : [{"avg":{"direction":66.88,"speed":7.66},"date":"2021-05-29T00:00+08:00","max":{"direction":0,"speed":15.48},"min":{"direction":54.16,"speed":1.11}},{"avg":{"direction":341.76,"speed":13.37},"date":"2021-05-30T00:00+08:00","max":{"direction":44.28,"speed":31.22},"min":{"direction":261.78,"speed":4.16}},{"avg":{"direction":55.78,"speed":14.91},"date":"2021-05-31T00:00+08:00","max":{"direction":46.89,"speed":18.59},"min":{"direction":117.1,"speed":10.07}},{"avg":{"direction":106.67,"speed":8.01},"date":"2021-06-01T00:00+08:00","max":{"direction":64.12,"speed":11.57},"min":{"direction":158.16,"speed":5.63}},{"avg":{"direction":163.22,"speed":6.41},"date":"2021-06-02T00:00+08:00","max":{"direction":77.97,"speed":10.48},"min":{"direction":156.11,"speed":2.53}}]
             */

            private AirQualityBean air_quality;
            private LifeIndexBean life_index;
            private String status;
            private List<AstroBean> astro;
            private List<CloudrateBean> cloudrate;
            private List<DswrfBean> dswrf;
            private List<HumidityBean> humidity;
            private List<PrecipitationBean> precipitation;
            private List<PressureBean> pressure;
            private List<SkyconBean> skycon;
            private List<Skycon08h20hBean> skycon_08h_20h;
            private List<Skycon20h32hBean> skycon_20h_32h;
            private List<TemperatureBean> temperature;
            private List<VisibilityBean> visibility;
            private List<WindBean> wind;

            @lombok.Data
            public static class AirQualityBean implements Serializable {
                private List<AqiBean> aqi;
                private List<Pm25Bean> pm25;

                @lombok.Data
                public static class AqiBean implements Serializable {
                    /**
                     * avg : {"chn":7.86,"usa":7.86}
                     * date : 2021-05-29T00:00+08:00
                     * max : {"chn":13,"usa":13}
                     * min : {"chn":7,"usa":7}
                     */

                    private AvgBean avg;
                    private String date;
                    private MaxBean max;
                    private MinBean min;

                    @lombok.Data
                    public static class AvgBean implements Serializable {
                        /**
                         * chn : 7.86
                         * usa : 7.86
                         */

                        private Double chn;
                        private Double usa;
                    }

                    @lombok.Data
                    public static class MaxBean implements Serializable {
                        /**
                         * chn : 13
                         * usa : 13
                         */

                        private Integer chn;
                        private Integer usa;
                    }

                    @lombok.Data
                    public static class MinBean implements Serializable {
                        /**
                         * chn : 7
                         * usa : 7
                         */

                        private Integer chn;
                        private Integer usa;
                    }
                }

                @lombok.Data
                public static class Pm25Bean implements Serializable {
                    /**
                     * avg : 6.0
                     * date : 2021-05-29T00:00+08:00
                     * max : 7
                     * min : 3
                     */

                    private Double avg;
                    private String date;
                    private Integer max;
                    private Integer min;
                }
            }

            @lombok.Data
            public static class LifeIndexBean implements Serializable {
                private List<CarWashingBean> carWashing;
                private List<ColdRiskBean> coldRisk;
                private List<ComfortBean> comfort;
                private List<DressingBean> dressing;
                private List<UltravioletBean> ultraviolet;

                @lombok.Data
                public static class CarWashingBean implements Serializable {
                    /**
                     * date : 2021-05-29T00:00+08:00
                     * desc : 较不适宜
                     * index : 3
                     */

                    private String date;
                    private String desc;
                    private String index;
                }

                @lombok.Data
                public static class ColdRiskBean implements Serializable {
                    /**
                     * date : 2021-05-29T00:00+08:00
                     * desc : 极易发
                     * index : 4
                     */

                    private String date;
                    private String desc;
                    private String index;
                }

                @lombok.Data
                public static class ComfortBean implements Serializable {
                    /**
                     * date : 2021-05-29T00:00+08:00
                     * desc : 热
                     * index : 3
                     */

                    private String date;
                    private String desc;
                    private String index;
                }

                @lombok.Data
                public static class DressingBean implements Serializable {
                    /**
                     * date : 2021-05-29T00:00+08:00
                     * desc : 很热
                     * index : 2
                     */

                    private String date;
                    private String desc;
                    private String index;
                }

                @lombok.Data
                public static class UltravioletBean implements Serializable {
                    /**
                     * date : 2021-05-29T00:00+08:00
                     * desc : 最弱
                     * index : 1
                     */

                    private String date;
                    private String desc;
                    private String index;
                }
            }

            @lombok.Data
            public static class AstroBean implements Serializable {
                /**
                 * date : 2021-05-29T00:00+08:00
                 * sunrise : {"time":"05:03"}
                 * sunset : {"time":"18:37"}
                 */

                private String date;
                private SunriseBean sunrise;
                private SunsetBean sunset;

                @lombok.Data
                public static class SunriseBean implements Serializable {
                    /**
                     * time : 05:03
                     */

                    private String time;
                }

                @lombok.Data
                public static class SunsetBean implements Serializable {
                    /**
                     * time : 18:37
                     */

                    private String time;
                }
            }

            @lombok.Data
            public static class CloudrateBean implements Serializable {
                /**
                 * avg : 0.97
                 * date : 2021-05-29T00:00+08:00
                 * max : 1.0
                 * min : 0.9
                 */

                private Double avg;
                private String date;
                private Double max;
                private Double min;
            }

            @lombok.Data
            public static class DswrfBean implements Serializable {
                /**
                 * avg : 27.8
                 * date : 2021-05-29T00:00+08:00
                 * max : 288.2
                 * min : 0.0
                 */

                private Double avg;
                private String date;
                private Double max;
                private Double min;
            }

            @lombok.Data
            public static class HumidityBean implements Serializable {
                /**
                 * avg : 0.83
                 * date : 2021-05-29T00:00+08:00
                 * max : 0.92
                 * min : 0.52
                 */

                private Double avg;
                private String date;
                private Double max;
                private Double min;
            }

            @lombok.Data
            public static class PrecipitationBean implements Serializable {
                /**
                 * avg : 0.656
                 * date : 2021-05-29T00:00+08:00
                 * max : 2.1625
                 * min : 0.0
                 */

                private Double avg;
                private String date;
                private Double max;
                private Double min;
            }

            @lombok.Data
            public static class PressureBean implements Serializable {
                /**
                 * avg : 99029.11
                 * date : 2021-05-29T00:00+08:00
                 * max : 99276.23
                 * min : 98925.55
                 */

                private Double avg;
                private String date;
                private Double max;
                private Double min;
            }

            @lombok.Data
            public static class SkyconBean implements Serializable {
                /**
                 * date : 2021-05-29T00:00+08:00
                 * value : MODERATE_RAIN
                 */

                private String date;
                private String value;
            }

            @lombok.Data
            public static class Skycon08h20hBean implements Serializable {
                /**
                 * date : 2021-05-29T00:00+08:00
                 * value : MODERATE_RAIN
                 */

                private String date;
                private String value;
            }

            @lombok.Data
            public static class Skycon20h32hBean implements Serializable {
                /**
                 * date : 2021-05-29T00:00+08:00
                 * value : MODERATE_RAIN
                 */

                private String date;
                private String value;
            }

            @lombok.Data
            public static class TemperatureBean implements Serializable {
                /**
                 * avg : 27.5
                 * date : 2021-05-29T00:00+08:00
                 * max : 32.16
                 * min : 24.0
                 */

                private Double avg;
                private String date;
                private Double max;
                private Double min;
            }

            @lombok.Data
            public static class VisibilityBean implements Serializable {
                /**
                 * avg : 11.6
                 * date : 2021-05-29T00:00+08:00
                 * max : 24.05
                 * min : 7.01
                 */

                private Double avg;
                private String date;
                private Double max;
                private Double min;
            }

            @lombok.Data
            public static class WindBean implements Serializable {
                /**
                 * avg : {"direction":66.88,"speed":7.66}
                 * date : 2021-05-29T00:00+08:00
                 * max : {"direction":0,"speed":15.48}
                 * min : {"direction":54.16,"speed":1.11}
                 */

                private AvgBeanX avg;
                private String date;
                private MaxBeanX max;
                private MinBeanX min;

                @lombok.Data
                public static class AvgBeanX implements Serializable {
                    /**
                     * direction : 66.88
                     * speed : 7.66
                     */

                    private Double direction;
                    private Double speed;
                }

                @lombok.Data
                public static class MaxBeanX implements Serializable {
                    /**
                     * direction : 0.0
                     * speed : 15.48
                     */

                    private Double direction;
                    private Double speed;
                }

                @lombok.Data
                public static class MinBeanX implements Serializable {
                    /**
                     * direction : 54.16
                     * speed : 1.11
                     */

                    private Double direction;
                    private Double speed;
                }
            }
        }
    }
}
