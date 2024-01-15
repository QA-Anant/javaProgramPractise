import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.*;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonExample1{
    public static void main(String args[]) throws JsonProcessingException {
//        String test = "{\"event_order_id\":\"1584975\",\"request_id\":\"1661249559610\",\"order_details\":{\"requested_by_user\":\"272FED46F94E7316\",\"requested_utc_date_time\":\"2022-08-23T10:12:41.000Z\",\"order_type\":\"Normal - Time based order\",\"events_request_type\":\"Both\"}}";
//        String newtest = test.substring(19,26);
//
//        System.out.println("order id :"+newtest );

//        String test2 = "{\"DcsFileInfo\":[{\"CameraSn\":\"GE3CA715\",\"IterationFileName\":\"13515346-2-20220831T0400.DCS\",\"DcsFileContent\":\"Timestamp=2022-08-24T04:00:19\\nSmartRecorderSN=GE3CA715\\nVersion=1\\nIteration=1\\n\\nBOR,2022-08-24T04:00:13,2022-08-24T04:00:33,T21,P1\\n\"},{\"CameraSn\":\"GE3CA715\",\"IterationFileName\":\"13515346-1-20220831T0400.DCS\",\"DcsFileContent\":\"Timestamp=2022-08-24T04:00:19\\nSmartRecorderSN=GE3CA715\\nVersion=1\\nIteration=0\\n\\nBOR,2022-08-24T04:00:13,2022-08-24T04:00:33,T11,P1\\n\"},{\"CameraSn\":\"GE3CA715\",\"IterationFileName\":\"1486605-1-20220831T0400.DCS\",\"DcsFileContent\":\"Timestamp=2022-08-24T02:00:33\\nSmartRecorderSN=GE3CA715\\nVersion=1\\nIteration=0\\n\\nBOR,2022-08-24T04:00:13,2022-08-24T04:00:33,T11,P1\\n\"},{\"CameraSn\":\"GE3CA715\",\"IterationFileName\":\"1486605-2-20220831T0400.DCS\",\"DcsFileContent\":\"Timestamp=2022-08-24T02:00:33\\nSmartRecorderSN=GE3CA715\\nVersion=1\\nIteration=1\\n\\nBOR,2022-08-24T04:00:13,2022-08-24T04:00:33,T21,P1\\n\"}],\"CancelledOrders\":\"\"}";
//
////        JSONObject jsonObject = new JSONObject(test2);
//        ObjectMapper map = new ObjectMapper();
//        JsonNode node = map.readTree(test2);
//
//        List<String> arr1 = new ArrayList<>();
//        Iterator<JsonNode> jsn = node.get("DcsFileInfo").iterator();
//        while(jsn.hasNext())
//        {
//            //System.out.println(jsn.next().get("IterationFileName").toString());
//            arr1.add(jsn.next().get("IterationFileName").toString().substring(1).split("-")[0]);
//        }

        int totalOrdersPlaced = 0;
        System.out.println(totalOrdersPlaced++);
        System.out.println("Mod Result :"+totalOrdersPlaced % 2);
//        System.out.println(totalOrdersPlaced++);
//        System.out.println("Mod Result :"+totalOrdersPlaced % 2);
    }}