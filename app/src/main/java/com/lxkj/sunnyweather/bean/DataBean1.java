package com.lxkj.sunnyweather.bean;

import java.io.Serializable;
import java.util.List;

@lombok.Data
public class DataBean1 implements Serializable {


    /**
     * places : [{"formatted_address":"中国北京市","id":"ChIJuSwU55ZS8DURiqkPryBWYrk","location":{"lat":39.9041999,"lng":116.4073963},"name":"北京市","place_id":"g-ChIJuSwU55ZS8DURiqkPryBWYrk"},{"formatted_address":"中国 北京市 丰台区 莲花池东路118号","id":"B000A83M61","location":{"lat":39.89491,"lng":116.322056},"name":"北京西站","place_id":"a-B000A83M61"},{"formatted_address":"中国 北京市 东城区 毛家湾胡同甲13号","id":"B000A83C36","location":{"lat":39.902842,"lng":116.427341},"name":"北京站","place_id":"a-B000A83C36"},{"formatted_address":"中国 北京市 西城区 北滨河路1号","id":"B000A833V8","location":{"lat":39.944876,"lng":116.353063},"name":"北京北站","place_id":"a-B000A833V8"},{"formatted_address":"中国 北京市 朝阳区 百子湾路7号","id":"B000A350CB","location":{"lat":39.90242,"lng":116.485079},"name":"北京东站","place_id":"a-B000A350CB"}]
     * query : 北京
     * status : ok
     */

    private String query;
    private String status;
    private List<PlacesBean> places;

    @lombok.Data
    public static class PlacesBean implements Serializable {
        /**
         * formatted_address : 中国北京市
         * id : ChIJuSwU55ZS8DURiqkPryBWYrk
         * location : {"lat":39.9041999,"lng":116.4073963}
         * name : 北京市
         * place_id : g-ChIJuSwU55ZS8DURiqkPryBWYrk
         */

        private String formatted_address;
        private String id;
        private LocationBean location;
        private String name;
        private String place_id;

        @lombok.Data
        public static class LocationBean implements Serializable {
            /**
             * lat : 39.9041999
             * lng : 116.4073963
             */

            private Double lat;
            private Double lng;
        }
    }
}
