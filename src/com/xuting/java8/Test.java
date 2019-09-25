package src.com.xuting.java8;

import java.sql.DatabaseMetaData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2019/7/23 17:53
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException, ParseException {
//        List<Apple> apple = new ArrayList();
//        apple.add(new Apple(1, 1));
//        apple.add(new Apple(3, 3));
//        apple.add(new Apple(2, 2));
//        for (Apple apple1 : apple) {
//            System.out.println("id:" + apple1.getId() + ",weight:" + apple1.getWeight());
//        }
//        apple.sort(Comparator.comparing(Apple::getWeight));
//        for (Apple apple1 : apple) {
//            System.out.println("id:" + apple1.getId() + ",weight:" + apple1.getWeight());
//        }

//        System.out.println(aaa());
        int days = -1441 / (24 * 60);
        int day = Math.abs(-1441 % (24 * 60));
        int day2 = 952 / (24 * 60);
//        System.out.println(days);
//        System.out.println(day);
//        System.out.println(day2);
        String r = "yo在游玩日后123天03:01前申请22";
        System.out.println(r.contains("游玩日当天"));
        String x = r.split("游玩日后")[1];
        String z = x.substring(0,x.indexOf("天"));
        String q = x.substring(x.indexOf("天")+1,x.indexOf("天")+6);
        Long zz = Long.valueOf(z);
        System.out.println(q);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date d = sdf.parse(q);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.get(Calendar.HOUR);
        System.out.println(calendar.get(Calendar.HOUR));
        calendar.add(Calendar.HOUR,-1);

        System.out.println(sdf.format(calendar.getTime()));



//        int days = item.getLatestCancelTime().intValue() / (24 * 60);
//        int daysMod = Math.abs(item.getLatestCancelTime().intValue() % (24 * 60));
//        int hours = 0;
//        int minutes = 0;
//        if (days < 0) {
//            //使用日期后
//            r.setOffset_day_type(3L);
//            r.setOffset_days(Long.valueOf(Math.abs(days)));
//            hours = daysMod / 60;
//        } else if (days == 0 && item.getLatestCancelTime() <= 0) {
//            //使用日期当天
//            r.setOffset_day_type(2L);
//        } else {
//            r.setOffset_day_type(1L);
//        }
        return;

    }

    private static int aaa() throws ExecutionException, InterruptedException {

        List a = new ArrayList();
//        IntStream.range(1,2).boxed()
//                .forEach(o -> CompletableFuture.supplyAsync(() ->
//                        {
//                            try {
//                                Thread.sleep(5000);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                            return 1;
//                        }
//                ).thenAccept(a::add));

        CompletableFuture[] cfs = IntStream.range(0,0).boxed()
                .map(o -> CompletableFuture.supplyAsync(() ->
                        {

                                System.out.println(o);

                            return 1;
                        }
                ).thenAccept(a::add))
                .toArray(CompletableFuture[]::new);
        CompletableFuture.allOf(cfs).whenComplete((v, t) -> {
            //处理返回结果
        }).join();
        return 999;
    }

}
