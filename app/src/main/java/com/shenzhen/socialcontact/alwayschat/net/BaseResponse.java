package com.shenzhen.socialcontact.alwayschat.net;

import java.io.Serializable;
import java.util.List;

public class BaseResponse<T> implements Serializable
{

    /**
     * total : 1020
     * pageCount : 9
     * page : 0
     * size : 120
     * icon : http://image.quanmin.tv/217cd47dce820d8cdf4be3ce8d48144cpng
     * data : []
     * recommend : {}
     */

    private int total;
    private int pageCount;
    private int page;
    private int size;
    private String icon;
    private RecommendBean recommend;
    private T data;

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public int getPageCount()
    {
        return pageCount;
    }

    public void setPageCount(int pageCount)
    {
        this.pageCount = pageCount;
    }

    public int getPage()
    {
        return page;
    }

    public void setPage(int page)
    {
        this.page = page;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public String getIcon()
    {
        return icon;
    }

    public void setIcon(String icon)
    {
        this.icon = icon;
    }

    public RecommendBean getRecommend()
    {
        return recommend;
    }

    public void setRecommend(RecommendBean recommend)
    {
        this.recommend = recommend;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public static class RecommendBean
    {

        /**
         * name : 全民新星
         * icon : http://image.quanmin.tv/97790bb3db0dd41126199ae2b05371d0png
         * data : [{"id":282,"title":"1","thumb":"","link":"","create_at":"2016-01-30 10:54:59","status":1,"fk":"1516089130","subtitle":"","content":"",
         * "ext":null,"slot_id":61,"priority":1,"link_object":{"no":"15360529","nick":"小寡妇囡囡丶","avatar":"http://a.img.shouyintv.cn/PFz0201-normal",
         * "follow":"258","uid":"1516089130","play_at":"2017-04-28 14:04:53","views":"16","intro":"173cm 98年 96斤 一个越来越怂的的打野 AD 就会那么几个英雄。。 虽然我菜但是我有马甲线啊QAQ 
         * 喜欢我可以加Q群171351005 会有水友赛 关注新浪微博 腊鸡小寡妇z 会不定期更新主播生活照","videoQuality":"","thumb":"http://snap.quanmin
         * .tv/1516089130-1493364776-685.jpg?imageView2/2/w/390/","stream":"http://flv.quanmin.tv/live/1516089130.flv","position":"外太空","announcement":"",
         * "id":"289606","channelId":"0","video":"http://thumb.quanmin.tv/1516089130.mp4?t=1493364600","slug":"","category_id":"1",
         * "cover":"1516089130-1493364776-685.jpg","status":"2","weight":"0","start_time":"1493359493.837","check":"1","priv":"0","category_name":"英雄联盟",
         * "title":"一定要有一些遗憾才能证明这事生活不是童话","source":"ws","last_play_at":"","landscape":"1","view":"5142","screen":0,"categoryId":"1","hidden":false,
         * "play_status":true,"icontext":"","category_slug":"lol","frame":""}},{"id":286,"title":"2","thumb":"","link":"","create_at":"2016-01-30 11:00:25",
         * "status":1,"fk":"6754784","subtitle":"","content":"","ext":null,"slot_id":61,"priority":2,"link_object":{"no":"6754784","nick":"全民 tv 安神",
         * "avatar":"http://a.img.shouyintv.cn/61xw101-normal","follow":"1146","id":"64514","uid":"6754784","title":"百星荣耀王者--第一马克教学","category_id":"17",
         * "slug":"","intro":"","announcement":"每天下午两点准时开播","cover":"6754784-1493364716-455.jpg","play_at":"2017-04-28 14:08:07","last_play_at":"",
         * "view":"4971","views":"18","status":"2","priv":"0","landscape":"1","position":"外太空","weight":"0","check":"1","recommend_image":"",
         * "videoQuality":"","category_name":"王者荣耀","screen":0,"start_time":"1493359795.538","source":"ws","thumb":"http://snap.quanmin
         * .tv/6754784-1493364716-455.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/6754784.mp4?t=1493364600","stream":"http://flv.quanmin
         * .tv/live/6754784.flv","categoryId":"17","hidden":false,"play_status":true,"icontext":"","category_slug":"wangzhe","frame":""}},{"id":290,
         * "title":"3","thumb":"","link":"","create_at":"2016-02-01 09:28:29","status":1,"fk":"2071977262","subtitle":"","content":"","ext":null,
         * "slot_id":61,"priority":3,"link_object":{"no":"15605610","nick":"ω ℱ、宋宋","avatar":"http://a.img.shouyintv.cn/OzE7201-normal","follow":"1686",
         * "id":"300367","uid":"2071977262","title":"","category_id":"29","slug":"","intro":"","announcement":"","cover":"2071977262-1493364774-900.jpg",
         * "play_at":"2017-04-28 13:40:59","last_play_at":"","view":"2306","views":"13","status":"2","priv":"0","landscape":"0","position":"外太空",
         * "weight":"0","check":"1","videoQuality":"","category_name":"Showing","channelId":"0","start_time":"1493364524.75","source":"ws",
         * "stream":"http://flv.quanmin.tv/live/2071977262.flv","thumb":"http://a.img.shouyintv.cn/OzE7201-big","video":"http://thumb.quanmin
         * .tv/2071977262.mp4?t=1493364600","screen":1,"categoryId":"29","hidden":false,"play_status":true,"icontext":"","category_slug":"showing",
         * "frame":""}},{"id":431,"title":"4","thumb":"","link":"","create_at":"2016-03-17 16:00:05","status":1,"fk":"4713886","subtitle":"","content":"",
         * "ext":null,"slot_id":61,"priority":5,"link_object":{"no":"6785977","nick":"全民Tv丶寒霸霸","avatar":"http://a.img.shouyintv.cn/g82n101-normal",
         * "follow":"1366","uid":"4713886","play_at":"2017-04-28 14:47:26","views":"6","intro":"《守望先锋》水友QQ群:281183740，没事就来找我上分吧","videoQuality":"",
         * "thumb":"http://snap.quanmin.tv/4713886-1493364774-339.jpg?imageView2/2/w/390/","stream":"http://flv.quanmin.tv/live/4713886_L3.flv",
         * "position":"外太空","announcement":"周一至周五 早八点到中午 其实看心情啦","id":"107685","slug":"hangetianxiawushuang","video":"http://thumb.quanmin
         * .tv/4713886.mp4?t=1493364600","category_id":"15","cover":"4713886-1493364774-339.jpg","status":"2","recommend_image":"","weight":"0",
         * "start_time":"1493362046.797","check":"1","priv":"0","category_name":"守望先锋","title":"鱼塘教学，免费带水友上车","source":"ws","last_play_at":"",
         * "landscape":"1","view":"2607","screen":0,"categoryId":"15","hidden":false,"play_status":true,"icontext":"","category_slug":"overwatch",
         * "frame":""}},{"id":477,"title":"5","thumb":"","link":"","create_at":"2016-03-26 10:10:30","status":1,"fk":"2145229680","subtitle":"","content":"",
         * "ext":null,"slot_id":61,"priority":6,"link_object":{"no":"15782044","nick":"AI舞出你的性感","avatar":"http://a.img.shouyintv.cn/usG3201-normal",
         * "follow":"12","id":"314530","uid":"2145229680","title":"真的不会跳舞","category_id":"4","slug":"fangfang1","intro":"","announcement":"",
         * "cover":"2145229680-1493364723-175.jpg","play_at":"2017-04-28 15:05:11","last_play_at":"","view":"1427","views":"52","status":"2","priv":"0",
         * "landscape":"1","position":"外太空","weight":"0","check":"1","videoQuality":"","category_name":"全民星秀","channelId":"0","start_time":"1493363295.301",
         * "source":"ws","stream":"http://flv.quanmin.tv/live/2145229680.flv","thumb":"http://snap.quanmin
         * .tv/2145229680-1493364723-175.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/2145229680.mp4?t=1493364600","screen":0,"categoryId":"4",
         * "hidden":false,"play_status":true,"icontext":"","category_slug":"beauty","frame":""}},{"id":1709,"title":"7","thumb":"","link":"",
         * "create_at":"2017-01-10 13:41:53","status":1,"fk":"3629823","subtitle":"","content":"","ext":null,"slot_id":61,"priority":0,
         * "link_object":{"no":"3629823","nick":"忧郁的小白","avatar":"http://image.quanmin.tv/avatar/0de8d07d45ed7a26687f1501e78b81f5?imageView2/2/w/300/",
         * "follow":"374","id":"45621","uid":"3629823","title":"富强民主文明和谐自由平等公正爱国敬业友善","category_id":"5","slug":"iiiiiized","intro":"","announcement":"肥皂群 
         * 576385471","cover":"3629823-1493364775-171.jpg","play_at":"2017-04-28 13:37:53","last_play_at":"","view":"2494","views":"4","status":"2",
         * "priv":"0","landscape":"1","position":"","weight":"0","check":"1","recommend_image":"","videoQuality":"","category_name":"单机主机","screen":0,
         * "start_time":"1493357873.161","source":"ws","thumb":"http://snap.quanmin.tv/3629823-1493364775-171.jpg?imageView2/2/w/390/","video":"http://thumb
         * .quanmin.tv/3629823.mp4?t=1493364600","stream":"http://flv.quanmin.tv/live/3629823.flv","categoryId":"5","hidden":false,"play_status":true,
         * "icontext":"","category_slug":"tvgame","frame":""}},{"link_object":{"no":"333","nick":"孙悟空zzzz","avatar":"http://image.quanmin
         * .tv/avatar/ac45513f9123f49adc064f02f835f6f6?imageView2/2/w/300/","follow":"848207","uid":"333","play_at":"2017-04-28 10:14:44","screen":0,
         * "views":"18866","intro":"新浪微博：孙悟空kingking百度贴吧：lol猴王悟空 每天早10点直播","videoQuality":"342","thumb":"http://snap.quanmin
         * .tv/333-1493364775-745.jpg?imageView2/2/w/390/","stream":"http://flv.quanmin.tv/live/333_L3.flv","position":"","announcement":"每天早上10点直播",
         * "channelId":"0","id":"100457","slug":"","video":"http://thumb.quanmin.tv/333.mp4?t=1493364600","category_id":"1","cover":"333-1493364775-745.jpg",
         * "status":"2","recommend_image":"http://image.quanmin.tv/94c7901bce10d0636e704bba43a01045jpg","weight":"0","start_time":"1493345684.557",
         * "check":"1","priv":"0","category_name":"英雄联盟","title":"国服最强猴王","source":"ws","last_play_at":"","landscape":"1","view":"575926",
         * "app_shuffling_image":"http://image.quanmin.tv/d6808580cd0c897366c76df33ed95902jpg","categoryId":"1","hidden":false,"play_status":true,
         * "icontext":"","category_slug":"lol","frame":""},"fk":"333"},{"link_object":{"no":"1939881","nick":"丶愤怒的小裸裸","avatar":"http://image.quanmin
         * .tv/avatar/3317bf1f4e52cfc6edb3d2a1f3bbd204jpg?imageView2/2/w/300/","follow":"280489","id":"100592","uid":"1939881","title":"小裸裸：国服第一闭眼中单！",
         * "category_id":"1","slug":"","intro":"","announcement":"每天下午4点开播！每周五休息！","cover":"1939881-1493364723-934.jpg","play_at":"2017-04-28 11:59:20",
         * "last_play_at":"","view":"275595","views":"1656","status":"2","priv":"0","landscape":"1","position":"","weight":"0","check":"1",
         * "recommend_image":"http://image.quanmin.tv/9f5c2fdd5330451c1e7b1694f29a0293jpg","videoQuality":"234","category_name":"英雄联盟","screen":0,
         * "start_time":"1493351960.609","source":"ws","thumb":"http://snap.quanmin.tv/1939881-1493364723-934.jpg?imageView2/2/w/390/","video":"http://thumb
         * .quanmin.tv/1939881.mp4?t=1493364600","stream":"http://flv.quanmin.tv/live/1939881_L3.flv","app_shuffling_image":"http://image.quanmin
         * .tv/821e7a267c954ff7ffd5d4c7917487eajpg","categoryId":"1","hidden":false,"play_status":true,"icontext":"","category_slug":"lol","frame":""},
         * "fk":"1939881"},{"link_object":{"no":"4242823","nick":"LGDpyl1","avatar":"http://image.quanmin
         * .tv/avatar/f9d97f56c820507c8fdc6c5c10aec110?imageView2/2/w/300/","follow":"305308","id":"96489","uid":"4242823","title":"LGD.pyl",
         * "category_id":"1","slug":"pyl","intro":"欢迎加入Pyl粉丝⑥群：542852799","announcement":"下午1点-晚上2点","cover":"4242823-1493364775-106.jpg",
         * "play_at":"2017-04-28 15:16:53","last_play_at":"","view":"207308","views":"362","status":"2","priv":"0","landscape":"1","position":"",
         * "weight":"0","check":"1","recommend_image":"http://image.quanmin.tv/eb69d1ecbed5b476b26f1c236c6845d6jpg","videoQuality":"234",
         * "category_name":"英雄联盟","screen":0,"start_time":"1493363813.926","source":"ws","thumb":"http://snap.quanmin
         * .tv/4242823-1493364775-106.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/4242823.mp4?t=1493364600","stream":"http://flv.quanmin
         * .tv/live/4242823_L3.flv","channelId":"0","app_shuffling_image":"http://image.quanmin.tv/2605c7d547fba77e807711cb591ee7dajpg","categoryId":"1",
         * "hidden":false,"play_status":true,"icontext":"","category_slug":"lol","frame":""},"fk":"4242823"},{"link_object":{"no":"15368717","nick":"Sky夏雨",
         * "avatar":"http://a.img.shouyintv.cn/1qSu101-normal","follow":"68963","id":"289741","uid":"2071834416","title":"继续送新英雄皮肤：打完一局抽弹幕送福",
         * "category_id":"1","slug":"","intro":"黑色玫瑰满英雄满皮肤，商城已清空","announcement":"水友福利群号39455143","cover":"2071834416-1493364775-571.jpg",
         * "play_at":"2017-04-28 10:37:31","last_play_at":"","view":"188389","views":"2332","status":"2","priv":"0","landscape":"1","position":"外太空",
         * "weight":"0","check":"1","videoQuality":"","category_name":"英雄联盟","channelId":"0","start_time":"1493347051.531","source":"ws","stream":"http://flv
         * .quanmin.tv/live/2071834416.flv","thumb":"http://snap.quanmin.tv/2071834416-1493364775-571.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin
         * .tv/2071834416.mp4?t=1493364600","screen":0,"categoryId":"1","hidden":false,"play_status":true,"icontext":"","category_slug":"lol","frame":""},
         * "fk":"2071834416"}]
         */

        private String name;
        private String icon;
        private List<DataBean> data;

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getIcon()
        {
            return icon;
        }

        public void setIcon(String icon)
        {
            this.icon = icon;
        }

        public List<DataBean> getData()
        {
            return data;
        }

        public void setData(List<DataBean> data)
        {
            this.data = data;
        }

        public static class DataBean
        {
            /**
             * id : 282
             * title : 1
             * thumb : 
             * link : 
             * create_at : 2016-01-30 10:54:59
             * status : 1
             * fk : 1516089130
             * subtitle : 
             * content : 
             * ext : null
             * slot_id : 61
             * priority : 1
             * link_object : {"no":"15360529","nick":"小寡妇囡囡丶","avatar":"http://a.img.shouyintv.cn/PFz0201-normal","follow":"258","uid":"1516089130",
             * "play_at":"2017-04-28 14:04:53","views":"16","intro":"173cm 98年 96斤 一个越来越怂的的打野 AD 就会那么几个英雄。。 虽然我菜但是我有马甲线啊QAQ 喜欢我可以加Q群171351005 会有水友赛 关注新浪微博 
             * 腊鸡小寡妇z 会不定期更新主播生活照","videoQuality":"","thumb":"http://snap.quanmin.tv/1516089130-1493364776-685.jpg?imageView2/2/w/390/","stream":"http://flv
             * .quanmin.tv/live/1516089130.flv","position":"外太空","announcement":"","id":"289606","channelId":"0","video":"http://thumb.quanmin
             * .tv/1516089130.mp4?t=1493364600","slug":"","category_id":"1","cover":"1516089130-1493364776-685.jpg","status":"2","weight":"0",
             * "start_time":"1493359493.837","check":"1","priv":"0","category_name":"英雄联盟","title":"一定要有一些遗憾才能证明这事生活不是童话","source":"ws","last_play_at":"",
             * "landscape":"1","view":"5142","screen":0,"categoryId":"1","hidden":false,"play_status":true,"icontext":"","category_slug":"lol","frame":""}
             */

            private int id;
            private String title;
            private String thumb;
            private String link;
            private String create_at;
            private int status;
            private String fk;
            private String subtitle;
            private String content;
            private Object ext;
            private int slot_id;
            private int priority;
            private LinkObjectBean link_object;

            public int getId()
            {
                return id;
            }

            public void setId(int id)
            {
                this.id = id;
            }

            public String getTitle()
            {
                return title;
            }

            public void setTitle(String title)
            {
                this.title = title;
            }

            public String getThumb()
            {
                return thumb;
            }

            public void setThumb(String thumb)
            {
                this.thumb = thumb;
            }

            public String getLink()
            {
                return link;
            }

            public void setLink(String link)
            {
                this.link = link;
            }

            public String getCreate_at()
            {
                return create_at;
            }

            public void setCreate_at(String create_at)
            {
                this.create_at = create_at;
            }

            public int getStatus()
            {
                return status;
            }

            public void setStatus(int status)
            {
                this.status = status;
            }

            public String getFk()
            {
                return fk;
            }

            public void setFk(String fk)
            {
                this.fk = fk;
            }

            public String getSubtitle()
            {
                return subtitle;
            }

            public void setSubtitle(String subtitle)
            {
                this.subtitle = subtitle;
            }

            public String getContent()
            {
                return content;
            }

            public void setContent(String content)
            {
                this.content = content;
            }

            public Object getExt()
            {
                return ext;
            }

            public void setExt(Object ext)
            {
                this.ext = ext;
            }

            public int getSlot_id()
            {
                return slot_id;
            }

            public void setSlot_id(int slot_id)
            {
                this.slot_id = slot_id;
            }

            public int getPriority()
            {
                return priority;
            }

            public void setPriority(int priority)
            {
                this.priority = priority;
            }

            public LinkObjectBean getLink_object()
            {
                return link_object;
            }

            public void setLink_object(LinkObjectBean link_object)
            {
                this.link_object = link_object;
            }

            public static class LinkObjectBean
            {
                /**
                 * no : 15360529
                 * nick : 小寡妇囡囡丶
                 * avatar : http://a.img.shouyintv.cn/PFz0201-normal
                 * follow : 258
                 * uid : 1516089130
                 * play_at : 2017-04-28 14:04:53
                 * views : 16
                 * intro : 173cm 98年 96斤 一个越来越怂的的打野 AD 就会那么几个英雄。。 虽然我菜但是我有马甲线啊QAQ 喜欢我可以加Q群171351005 会有水友赛 关注新浪微博 腊鸡小寡妇z 会不定期更新主播生活照
                 * videoQuality : 
                 * thumb : http://snap.quanmin.tv/1516089130-1493364776-685.jpg?imageView2/2/w/390/
                 * stream : http://flv.quanmin.tv/live/1516089130.flv
                 * position : 外太空
                 * announcement : 
                 * id : 289606
                 * channelId : 0
                 * video : http://thumb.quanmin.tv/1516089130.mp4?t=1493364600
                 * slug : 
                 * category_id : 1
                 * cover : 1516089130-1493364776-685.jpg
                 * status : 2
                 * weight : 0
                 * start_time : 1493359493.837
                 * check : 1
                 * priv : 0
                 * category_name : 英雄联盟
                 * title : 一定要有一些遗憾才能证明这事生活不是童话
                 * source : ws
                 * last_play_at : 
                 * landscape : 1
                 * view : 5142
                 * screen : 0
                 * categoryId : 1
                 * hidden : false
                 * play_status : true
                 * icontext : 
                 * category_slug : lol
                 * frame : 
                 */

                private String no;
                private String nick;
                private String avatar;
                private String follow;
                private String uid;
                private String play_at;
                private String views;
                private String intro;
                private String videoQuality;
                private String thumb;
                private String stream;
                private String position;
                private String announcement;
                private String id;
                private String channelId;
                private String video;
                private String slug;
                private String category_id;
                private String cover;
                private String status;
                private String weight;
                private String start_time;
                private String check;
                private String priv;
                private String category_name;
                private String title;
                private String source;
                private String last_play_at;
                private String landscape;
                private String view;
                private int screen;
                private String categoryId;
                private boolean hidden;
                private boolean play_status;
                private String icontext;
                private String category_slug;
                private String frame;
                private String recommend_image;
                private String love_cover;
                private String app_shuffling_image;

                public String getApp_shuffling_image()
                {
                    return app_shuffling_image;
                }

                public void setApp_shuffling_image(String app_shuffling_image)
                {
                    this.app_shuffling_image = app_shuffling_image;
                }

                public String getLove_cover()
                {
                    return love_cover;
                }

                public void setLove_cover(String love_cover)
                {
                    this.love_cover = love_cover;
                }

                public String getRecommend_image()
                {
                    return recommend_image;
                }

                public void setRecommend_image(String recommend_image)
                {
                    this.recommend_image = recommend_image;
                }

                public String getNo()
                {
                    return no;
                }

                public void setNo(String no)
                {
                    this.no = no;
                }

                public String getNick()
                {
                    return nick;
                }

                public void setNick(String nick)
                {
                    this.nick = nick;
                }

                public String getAvatar()
                {
                    return avatar;
                }

                public void setAvatar(String avatar)
                {
                    this.avatar = avatar;
                }

                public String getFollow()
                {
                    return follow;
                }

                public void setFollow(String follow)
                {
                    this.follow = follow;
                }

                public String getUid()
                {
                    return uid;
                }

                public void setUid(String uid)
                {
                    this.uid = uid;
                }

                public String getPlay_at()
                {
                    return play_at;
                }

                public void setPlay_at(String play_at)
                {
                    this.play_at = play_at;
                }

                public String getViews()
                {
                    return views;
                }

                public void setViews(String views)
                {
                    this.views = views;
                }

                public String getIntro()
                {
                    return intro;
                }

                public void setIntro(String intro)
                {
                    this.intro = intro;
                }

                public String getVideoQuality()
                {
                    return videoQuality;
                }

                public void setVideoQuality(String videoQuality)
                {
                    this.videoQuality = videoQuality;
                }

                public String getThumb()
                {
                    return thumb;
                }

                public void setThumb(String thumb)
                {
                    this.thumb = thumb;
                }

                public String getStream()
                {
                    return stream;
                }

                public void setStream(String stream)
                {
                    this.stream = stream;
                }

                public String getPosition()
                {
                    return position;
                }

                public void setPosition(String position)
                {
                    this.position = position;
                }

                public String getAnnouncement()
                {
                    return announcement;
                }

                public void setAnnouncement(String announcement)
                {
                    this.announcement = announcement;
                }

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getChannelId()
                {
                    return channelId;
                }

                public void setChannelId(String channelId)
                {
                    this.channelId = channelId;
                }

                public String getVideo()
                {
                    return video;
                }

                public void setVideo(String video)
                {
                    this.video = video;
                }

                public String getSlug()
                {
                    return slug;
                }

                public void setSlug(String slug)
                {
                    this.slug = slug;
                }

                public String getCategory_id()
                {
                    return category_id;
                }

                public void setCategory_id(String category_id)
                {
                    this.category_id = category_id;
                }

                public String getCover()
                {
                    return cover;
                }

                public void setCover(String cover)
                {
                    this.cover = cover;
                }

                public String getStatus()
                {
                    return status;
                }

                public void setStatus(String status)
                {
                    this.status = status;
                }

                public String getWeight()
                {
                    return weight;
                }

                public void setWeight(String weight)
                {
                    this.weight = weight;
                }

                public String getStart_time()
                {
                    return start_time;
                }

                public void setStart_time(String start_time)
                {
                    this.start_time = start_time;
                }

                public String getCheck()
                {
                    return check;
                }

                public void setCheck(String check)
                {
                    this.check = check;
                }

                public String getPriv()
                {
                    return priv;
                }

                public void setPriv(String priv)
                {
                    this.priv = priv;
                }

                public String getCategory_name()
                {
                    return category_name;
                }

                public void setCategory_name(String category_name)
                {
                    this.category_name = category_name;
                }

                public String getTitle()
                {
                    return title;
                }

                public void setTitle(String title)
                {
                    this.title = title;
                }

                public String getSource()
                {
                    return source;
                }

                public void setSource(String source)
                {
                    this.source = source;
                }

                public String getLast_play_at()
                {
                    return last_play_at;
                }

                public void setLast_play_at(String last_play_at)
                {
                    this.last_play_at = last_play_at;
                }

                public String getLandscape()
                {
                    return landscape;
                }

                public void setLandscape(String landscape)
                {
                    this.landscape = landscape;
                }

                public String getView()
                {
                    return view;
                }

                public void setView(String view)
                {
                    this.view = view;
                }

                public int getScreen()
                {
                    return screen;
                }

                public void setScreen(int screen)
                {
                    this.screen = screen;
                }

                public String getCategoryId()
                {
                    return categoryId;
                }

                public void setCategoryId(String categoryId)
                {
                    this.categoryId = categoryId;
                }

                public boolean isHidden()
                {
                    return hidden;
                }

                public void setHidden(boolean hidden)
                {
                    this.hidden = hidden;
                }

                public boolean isPlay_status()
                {
                    return play_status;
                }

                public void setPlay_status(boolean play_status)
                {
                    this.play_status = play_status;
                }

                public String getIcontext()
                {
                    return icontext;
                }

                public void setIcontext(String icontext)
                {
                    this.icontext = icontext;
                }

                public String getCategory_slug()
                {
                    return category_slug;
                }

                public void setCategory_slug(String category_slug)
                {
                    this.category_slug = category_slug;
                }

                public String getFrame()
                {
                    return frame;
                }

                public void setFrame(String frame)
                {
                    this.frame = frame;
                }
            }
        }
    }
}