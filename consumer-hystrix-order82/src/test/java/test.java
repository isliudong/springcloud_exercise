import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * City:310100
 * CityName:上海市
 * ClassName:软件工程(卓越)1701
 * CollegeNo:000006
 * ComeWhere:崧泽大道7399号
 * County:310118
 * CountyName:青浦区
 * FaCity:510600
 * FaCityName:德阳市
 * FaComeWhere:冯店镇秒山村
 * FaCounty:510623
 * FaCountyName:中江县
 * FaProvince:510000
 * FaProvinceName:四川省
 * GetAreaUrl:/SPCP/Web/Report/GetArea
 * IdCard:510623199811148817
 * MoveTel:19983462351
 * Name:刘冬
 * Other:
 * PZData:[{"OptionName":"无","SelectId":"d4b03707-0619-4dfb-82c3-c1f2af3bfb53","TitleId":"35eec330-3122-4054-a4ac-fe8ac95135df","OptionType":"0"},{"OptionName":"无","SelectId":"2ff4ae72-0d80-4428-a919-68e04e9891b9","TitleId":"bd1fef27-db0a-4898-8963-8b8e34714dfc","OptionType":"0"},{"OptionName":"已获得，行程卡为绿色","SelectId":"89d405c9-1090-4adb-aec0-71845db13524","TitleId":"f4ebef6e-671e-4875-af59-5793999c4cf9","OptionType":"0"},{"OptionName":"否，未接触过","SelectId":"04570d7e-0b63-44d4-b8a2-edce144ee5bd","TitleId":"8bdb0d2b-649c-4798-9d95-9c2b06a0c7c1","OptionType":"0"},{"OptionName":"否","SelectId":"5712563d-eb34-4fd1-a9fe-1b68f57e7e38","TitleId":"be0ed244-91e5-4dbd-a4ab-9c5967145bf3","OptionType":"0"},{"OptionName":"身体状况良好，无异常症状","SelectId":"dd238366-45d4-42e9-abab-40f957c4991e","TitleId":"9e8df714-3e64-4052-9200-766680883e81","OptionType":"0"},{"OptionName":"否","SelectId":"46b00678-b1b5-47e0-b404-00ed9f1a5291","TitleId":"6c4db0fd-bb34-46a1-9f88-4a0315283398","OptionType":"0"},{"OptionName":"无","SelectId":"0aa7f224-b011-4dda-99d4-392ec010b36e","TitleId":"563d4739-5a0e-479e-b0aa-c6527fd5e522","OptionType":"0"},{"OptionName":"无","SelectId":"2dce9072-29b6-44bd-8e99-af1bef745692","TitleId":"22b30d38-3396-40d7-ba49-03beccc7eef4","OptionType":"0"},{"TitleId":"485a11c6-5e3c-4653-b0b8-7d9120fca128","OptionName":"无以上地区旅居史","SelectId":"ea9ae437-ee12-4c7b-b10f-ea0e572a93cd","OptionType":"1"}]
 * Province:310000
 * ProvinceName:上海市
 * ReSubmiteFlag:b027f21b-7aa0-474c-ad3d-4ef1e22ad7fe
 * Sex:男
 * SpeGrade:2017
 * SpeType:B
 * SpecialtyName:软件工程(卓越班)
 * StudentId:201731062227
 * blackCount:2
 * checkboxCount:1
 * checkbox_1:ea9ae437-ee12-4c7b-b10f-ea0e572a93cd
 * radioCount:9
 * radio_1:d4b03707-0619-4dfb-82c3-c1f2af3bfb53
 * radio_2:2ff4ae72-0d80-4428-a919-68e04e9891b9
 * radio_3:89d405c9-1090-4adb-aec0-71845db13524
 * radio_4:04570d7e-0b63-44d4-b8a2-edce144ee5bd
 * radio_5:5712563d-eb34-4fd1-a9fe-1b68f57e7e38
 * radio_6:dd238366-45d4-42e9-abab-40f957c4991e
 * radio_7:46b00678-b1b5-47e0-b404-00ed9f1a5291
 * radio_8:0aa7f224-b011-4dda-99d4-392ec010b36e
 * radio_9:2dce9072-29b6-44bd-8e99-af1bef745692
 * text_1:
 * text_2:
 * @author 28415@hand-china.com 2020/08/20 09:03
 */
public class test {
    @Test
    public void test1(){
        boolean submitFlag=false;
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("City", "310100");
        paramMap.put("CityName", "上海市");
        paramMap.put("ClassName", "软件工程(卓越)1701");
        paramMap.put("CollegeNo", "000006");
        paramMap.put("ComeWhere", "崧泽大道7399号");
        paramMap.put("County", "310118");
        paramMap.put("CountyName", "青浦区");
        paramMap.put("FaCity", "510600");
        paramMap.put("FaCityName", "德阳市");
        paramMap.put("FaComeWhere", "冯店镇秒山村");
        paramMap.put("FaCounty", "510623");
        paramMap.put("FaCountyName", "中江县");
        paramMap.put("FaProvince", "510000");
        paramMap.put("FaProvinceName", "四川省");
        paramMap.put("GetAreaUrl", "/SPCP/Web/Report/GetArea");
        paramMap.put("IdCard", "510623199811148817");
        paramMap.put("MoveTel", "19983462351");
        paramMap.put("Name", "刘冬");
        paramMap.put("Other", "");
        paramMap.put("PZData", "[{\"OptionName\":\"无\",\"SelectId\":\"d4b03707-0619-4dfb-82c3-c1f2af3bfb53\",\"TitleId\":\"35eec330-3122-4054-a4ac-fe8ac95135df\",\"OptionType\":\"0\"},{\"OptionName\":\"无\",\"SelectId\":\"2ff4ae72-0d80-4428-a919-68e04e9891b9\",\"TitleId\":\"bd1fef27-db0a-4898-8963-8b8e34714dfc\",\"OptionType\":\"0\"},{\"OptionName\":\"已获得，行程卡为绿色\",\"SelectId\":\"89d405c9-1090-4adb-aec0-71845db13524\",\"TitleId\":\"f4ebef6e-671e-4875-af59-5793999c4cf9\",\"OptionType\":\"0\"},{\"OptionName\":\"否，未接触过\",\"SelectId\":\"04570d7e-0b63-44d4-b8a2-edce144ee5bd\",\"TitleId\":\"8bdb0d2b-649c-4798-9d95-9c2b06a0c7c1\",\"OptionType\":\"0\"},{\"OptionName\":\"否\",\"SelectId\":\"5712563d-eb34-4fd1-a9fe-1b68f57e7e38\",\"TitleId\":\"be0ed244-91e5-4dbd-a4ab-9c5967145bf3\",\"OptionType\":\"0\"},{\"OptionName\":\"身体状况良好，无异常症状\",\"SelectId\":\"dd238366-45d4-42e9-abab-40f957c4991e\",\"TitleId\":\"9e8df714-3e64-4052-9200-766680883e81\",\"OptionType\":\"0\"},{\"OptionName\":\"否\",\"SelectId\":\"46b00678-b1b5-47e0-b404-00ed9f1a5291\",\"TitleId\":\"6c4db0fd-bb34-46a1-9f88-4a0315283398\",\"OptionType\":\"0\"},{\"OptionName\":\"无\",\"SelectId\":\"0aa7f224-b011-4dda-99d4-392ec010b36e\",\"TitleId\":\"563d4739-5a0e-479e-b0aa-c6527fd5e522\",\"OptionType\":\"0\"},{\"OptionName\":\"无\",\"SelectId\":\"2dce9072-29b6-44bd-8e99-af1bef745692\",\"TitleId\":\"22b30d38-3396-40d7-ba49-03beccc7eef4\",\"OptionType\":\"0\"},{\"TitleId\":\"485a11c6-5e3c-4653-b0b8-7d9120fca128\",\"OptionName\":\"无以上地区旅居史\",\"SelectId\":\"ea9ae437-ee12-4c7b-b10f-ea0e572a93cd\",\"OptionType\":\"1\"}]");
        paramMap.put("Province", "310000");
        paramMap.put("ProvinceName", "上海市");
        paramMap.put("ReSubmiteFlag", "b027f21b-7aa0-474c-ad3d-4ef1e22ad7fe");
        paramMap.put("Sex", "男");
        paramMap.put("SpeGrade", "2017");
        paramMap.put("SpeType", "B");
        paramMap.put("SpecialtyName", "软件工程(卓越班)");
        paramMap.put("StudentId", "201731062227");
        paramMap.put("blackCount", "2");
        paramMap.put("checkboxCount", "1");
        paramMap.put("checkbox_1", "ea9ae437-ee12-4c7b-b10f-ea0e572a93cd");
        paramMap.put("radioCount", "9");
        paramMap.put("radio_1", "d4b03707-0619-4dfb-82c3-c1f2af3bfb53");
        paramMap.put("radio_2", "2ff4ae72-0d80-4428-a919-68e04e9891b9");
        paramMap.put("radio_3", "89d405c9-1090-4adb-aec0-71845db13524");
        paramMap.put("radio_4", "04570d7e-0b63-44d4-b8a2-edce144ee5bd");
        paramMap.put("radio_5", "5712563d-eb34-4fd1-a9fe-1b68f57e7e38");
        paramMap.put("radio_6", "dd238366-45d4-42e9-abab-40f957c4991e");
        paramMap.put("radio_7", "46b00678-b1b5-47e0-b404-00ed9f1a5291");
        paramMap.put("radio_8", "0aa7f224-b011-4dda-99d4-392ec010b36e");
        paramMap.put("radio_9", "2dce9072-29b6-44bd-8e99-af1bef745692");
        paramMap.put("text_1", "");
        paramMap.put("text_2", "");

        String urlString = "http://xg.swpu.edu.cn/SPCP/Web/Report/Index";
        //String result= HttpUtil.get(urlString, paramMap);

        String result = HttpRequest.post(urlString)
                .header(Header.USER_AGENT, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")
                .header(Header.CONTENT_TYPE,"application/x-www-form-urlencoded")
                .header(Header.ORIGIN,"http://xg.swpu.edu.cn")
                .header(Header.UPGRADE,"1")
                .header(Header.ACCEPT,"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .header(Header.COOKIE,"ASP.NET_SessionId=cfgk5z3atjnwm15ilh2hare0; Path=/; Domain=.xg.swpu.edu.cn; HttpOnly;")
                .header(Header.COOKIE,"SPCPWeb=3126397BBA9F4C3040DDCFF8A2B8A0AE6473051F00AE7FAF647FA59DDFBC646BBDB6BDB1DF3F0E6F1454181D2F165A5E44B9DF243A3D687129B81D9D490EE7BF1EE7479D23B083817D0D1850396AA4DB21E301388A79585888F83CB434DAF2ED4666CA07BF8BEDDEF3236CC0BF1B6DC84A6FD0ED61B6C951729EFDD64FF7F631E01C464A3E6C80B3DFF5E12F1F42DA011A5F36B282104128268A8A05EA2D7535709856F9BD390CAB18B63BDB4C9C8A685875266B274A3419C9EC8DA1F6CD859F26B846D1A6748ADEBDBBBBDABF53C601E161B1865E4EB389FF2CA40C2D00F22A4BAEABE6E9ECB350DEED2B3E4F19936388163376D3D4822E2C0C26EDA17990D6B93E006EC09AADAF1423F2633E419CC00701A394AF92A807B78BD0EB4B70FA32232856ACFA11C4A039A1B1090C49AB9C; Path=/; Domain=.xg.swpu.edu.cn; HttpOnly;")
                //.header(Header.COOKIE,"LOGIN=323031373331303632323237; Path=/; Domain=.swpu.edu.cn;")
                //.header(Header.COOKIE,"SCREEN_NAME=624a6c3648356b70534a4a39674358653067684778513d3d; Path=/; Domain=.swpu.edu.cn;")
                .form(paramMap)//表单内容
                .timeout(20000)//超时，毫秒
                .execute().body();
        if (result.contains("提交成功")||result.contains("已登记")) {
            submitFlag=true;
        }
        if (submitFlag) {
            System.out.println("打卡成功！");
        }else {
            System.out.println("出大问题！");
        }

    }
}
