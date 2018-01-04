package com.home;

import org.elasticsearch.transport.client.*;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.settings.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import static org.elasticsearch.common.xcontent.XContentFactory.*;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.action.index.*;

public class Test{

public static void main ( String []args)throws Exception{
// on startup

TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
        .addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9300));

//

String json = "{" +
        "\"user\":\"Dell\"," +
        "\"postDate\":\"2013-01-30\"," +
        "\"message\":\"trying out Elasticsearch\"" +
    "}";

for ( int i=3;i<99;i++)
{
json = "{" +
        "\"user\":\"Dell\","+ 
        "\"postDate\":\"2013-01-30\"," +
        "\"message\":\"trying out Elasticsearch\"" + 
    "}";
  IndexResponse response = client.prepareIndex("twitter", "tweet")
        .setSource(json, XContentType.JSON)
        .get();
System.out.println("Value of id is  " + response.getId());
}
// on shutdown

client.close();


}

}
