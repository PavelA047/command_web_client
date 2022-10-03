package com.example.command_web_client;

import com.exemple.generate.CommandWs;
import com.exemple.generate.CommandWsImplService;

import java.net.MalformedURLException;
import java.net.URL;

public class CommandWebClient {
    public static void main(String[] args) throws MalformedURLException {
        // создаем ссылку на wsdl описание
        URL url = new URL("http://localhost:8081/wss/first?wsdl");

        CommandWsImplService servicehe = new CommandWsImplService(url);
        CommandWs hello = servicehe.getCommandWsImplPort();

        System.out.println(hello.getUsersNamesByRoles("lector").getItem());
    }
}
