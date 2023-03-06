package net.xdclass.demoproject.mapper;

import net.xdclass.demoproject.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class VideoMapper {

    private static Map<Integer, Video> videoMap = new HashMap<>();


    static {
        videoMap.put(1, new Video(1,"java基础课程，jdk1.8~13新特性"));
        videoMap.put(2, new Video(2,"SpringBoot2.x零基础到实战"));
        videoMap.put(3, new Video(3,"微服务SpringCloud全家桶"));
        videoMap.put(4, new Video(4,"SpringBoot实战微信支付课程"));
        videoMap.put(5, new Video(5,"小滴课堂面试专题第一季，300道大厂连环问"));
    }

    public List<Video> listVideo() {

        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());
        return list;
    }
}
