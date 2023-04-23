package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

   @GetMapping
    @ResponseBody
    public String skillsHome(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Top Programing Languages</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<li>Java</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping(value ="form")
    @ResponseBody
    public String skillsForm(){
        return "<html>\n" +
                "    <body>\n" +
                "<form method = 'post' action ='form'>" +
                "<input type = 'text' name = 'name' />" +
                "<label for=l1>Rank these languages:</label>" +
                "\n" +
                "<select name='l1' id='l1'>\n" +
                "  <option value=' Javascript'>JavaScript</option>\n" +
                "  <option value=' Java'>Java</option>\n" +
                "  <option value=' Python'>Python</option>\n" +
                "</select>"+
                "<select name='l2' id='l2'>\n" +
                "  <option value=' Javascript'>JavaScript</option>\n" +
                "  <option value=' Java'>Java</option>\n" +
                "  <option value=' Python'>Python</option>\n" +
                "</select>"+
                "<select name='l3' id='l3'>\n" +
                "  <option value=' Javascript'>JavaScript</option>\n" +
                "  <option value=' Java'>Java</option>\n" +
                "  <option value=' Python'>Python</option>\n" +
                "</select>"+
                "<input type = 'submit' value = 'Greet Me!' />" +
                "    </body>\n" +
                "</html>";

    }
    @PostMapping(value="form")
    @ResponseBody
    public String returnSkills(@RequestParam String name,@RequestParam String l1,@RequestParam String l2,@RequestParam String l3){
        return  "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<ol>" +
                "<li>"+l1+"</li>" +
                "<li>"+l2+"</li>" +
                "<li>"+l3+"</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
