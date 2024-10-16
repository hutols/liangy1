package Test;

import cn.hutool.core.convert.Convert;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class HolidayFetcher {
    public static void main(String[] args) {
        // 创建HttpClient实例
        HttpClient client = HttpClient.newHttpClient();

        // 设置API URL，这里以Nager.Date API为例
        String apiUrl = "https://date.nager.at/api/v2/PublicHolidays/2024/CN"; // 获取2023年中国法定假日

        // 创建HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .header("Accept", "application/json")
                .GET() // GET请求
                .build();
        // 发送请求并处理响应
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body) // 获取响应体
                .thenAccept(
                        a -> {

                            String jsonPrettyStr = JSONUtil.toJsonPrettyStr(a);
                            JSONArray objects = new JSONArray(jsonPrettyStr);
                            ArrayList<DateBean> list = new ArrayList<>();
                            for (Object item : objects){
                                String str = Convert.toStr(item);
                                DateBean bean = JSONUtil.toBean(str, DateBean.class);
                                list.add(bean);
                            }
                            System.out.println(list);
                            // System.out.println(JSONUtil.toJsonPrettyStr(parse));
                            //JSONUtil.toBean((JSONObject) parse,Boolean.class);
                        }
                ) // 打印响应
                .join();// 等待完成


    }
}