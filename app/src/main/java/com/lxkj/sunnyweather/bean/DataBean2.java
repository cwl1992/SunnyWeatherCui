package com.lxkj.sunnyweather.bean;

import java.io.Serializable;
import java.util.List;

@lombok.Data
public class DataBean2 implements Serializable {


    /**
     * api_status : active
     * api_version : v2.5
     * lang : zh_CN
     * location : [25.1552,121.6544]
     * result : {"primary":0,"realtime":{"air_quality":{"aqi":{"chn":9,"usa":0},"co":0,"description":{"chn":"优","usa":""},"no2":0,"o3":0,"pm10":0,"pm25":7,"so2":0},"apparent_temperature":32.9,"cloudrate":0.9,"dswrf":62.8,"humidity":0.52,"life_index":{"comfort":{"desc":"闷热","index":0},"ultraviolet":{"desc":"很弱","index":2}},"precipitation":{"local":{"datasource":"radar","intensity":0.2499,"status":"ok"},"nearest":{"distance":0,"intensity":4,"status":"ok"}},"pressure":98925.55,"skycon":"LIGHT_RAIN","status":"ok","temperature":32.16,"visibility":12.3,"wind":{"direction":0,"speed":15.48}}}
     * server_time : 1622279080
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
         * primary : 0
         * realtime : {"air_quality":{"aqi":{"chn":9,"usa":0},"co":0,"description":{"chn":"优","usa":""},"no2":0,"o3":0,"pm10":0,"pm25":7,"so2":0},"apparent_temperature":32.9,"cloudrate":0.9,"dswrf":62.8,"humidity":0.52,"life_index":{"comfort":{"desc":"闷热","index":0},"ultraviolet":{"desc":"很弱","index":2}},"precipitation":{"local":{"datasource":"radar","intensity":0.2499,"status":"ok"},"nearest":{"distance":0,"intensity":4,"status":"ok"}},"pressure":98925.55,"skycon":"LIGHT_RAIN","status":"ok","temperature":32.16,"visibility":12.3,"wind":{"direction":0,"speed":15.48}}
         */

        private Integer primary;
        private RealtimeBean realtime;

        @lombok.Data
        public static class RealtimeBean implements Serializable {
            /**
             * air_quality : {"aqi":{"chn":9,"usa":0},"co":0,"description":{"chn":"优","usa":""},"no2":0,"o3":0,"pm10":0,"pm25":7,"so2":0}
             * apparent_temperature : 32.9
             * cloudrate : 0.9
             * dswrf : 62.8
             * humidity : 0.52
             * life_index : {"comfort":{"desc":"闷热","index":0},"ultraviolet":{"desc":"很弱","index":2}}
             * precipitation : {"local":{"datasource":"radar","intensity":0.2499,"status":"ok"},"nearest":{"distance":0,"intensity":4,"status":"ok"}}
             * pressure : 98925.55
             * skycon : LIGHT_RAIN
             * status : ok
             * temperature : 32.16
             * visibility : 12.3
             * wind : {"direction":0,"speed":15.48}
             */

            private AirQualityBean air_quality;
            private Double apparent_temperature;
            private Double cloudrate;
            private Double dswrf;
            private Double humidity;
            private LifeIndexBean life_index;
            private PrecipitationBean precipitation;
            private Double pressure;
            private String skycon;
            private String status;
            private Double temperature;
            private Double visibility;
            private WindBean wind;

            @lombok.Data
            public static class AirQualityBean implements Serializable {
                /**
                 * aqi : {"chn":9,"usa":0}
                 * co : 0
                 * description : {"chn":"优","usa":""}
                 * no2 : 0
                 * o3 : 0
                 * pm10 : 0
                 * pm25 : 7
                 * so2 : 0
                 */

                private AqiBean aqi;
                private Integer co;
                private DescriptionBean description;
                private Integer no2;
                private Integer o3;
                private Integer pm10;
                private Integer pm25;
                private Integer so2;

                @lombok.Data
                public static class AqiBean implements Serializable {
                    /**
                     * chn : 9
                     * usa : 0
                     */

                    private Integer chn;
                    private Integer usa;
                }

                @lombok.Data
                public static class DescriptionBean implements Serializable {
                    /**
                     * chn : 优
                     * usa :
                     */

                    private String chn;
                    private String usa;
                }
            }

            @lombok.Data
            public static class LifeIndexBean implements Serializable {
                /**
                 * comfort : {"desc":"闷热","index":0}
                 * ultraviolet : {"desc":"很弱","index":2}
                 */

                private ComfortBean comfort;
                private UltravioletBean ultraviolet;

                @lombok.Data
                public static class ComfortBean implements Serializable {
                    /**
                     * desc : 闷热
                     * index : 0
                     */

                    private String desc;
                    private Integer index;
                }

                @lombok.Data
                public static class UltravioletBean implements Serializable {
                    /**
                     * desc : 很弱
                     * index : 2.0
                     */

                    private String desc;
                    private Double index;
                }
            }

            @lombok.Data
            public static class PrecipitationBean implements Serializable {
                /**
                 * local : {"datasource":"radar","intensity":0.2499,"status":"ok"}
                 * nearest : {"distance":0,"intensity":4,"status":"ok"}
                 */

                private LocalBean local;
                private NearestBean nearest;

                @lombok.Data
                public static class LocalBean implements Serializable {
                    /**
                     * datasource : radar
                     * intensity : 0.2499
                     * status : ok
                     */

                    private String datasource;
                    private Double intensity;
                    private String status;
                }

                @lombok.Data
                public static class NearestBean implements Serializable {
                    /**
                     * distance : 0.0
                     * intensity : 4.0
                     * status : ok
                     */

                    private Double distance;
                    private Double intensity;
                    private String status;
                }
            }

            @lombok.Data
            public static class WindBean implements Serializable {
                /**
                 * direction : 0.0
                 * speed : 15.48
                 */

                private Double direction;
                private Double speed;
            }
        }
    }
}
