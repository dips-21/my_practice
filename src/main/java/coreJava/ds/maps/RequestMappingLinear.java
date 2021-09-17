package coreJava.ds.maps;

//question ,DELETE
public class RequestMappingLinear {   //here MapDemo is key and url,methodtype is value of it.
    //6 5 0 2 1
    String[] person = {"/question", "/question", "/exam", "/exam", "/score", "/score", "/score"};
    String[] habit = {"GET", "POST", "GET", "DELETE", "GET", "PUT", "DELETE"};
    String[] description = {"qstnController.getQsts()", "qstnController.save", "examController.get()",
            "examController.End()", "score_get", "score_put", "score_delete()"};



    String getRequestMapping(String url, String methodType) {
        boolean isUrlFound = false;
        for (int i = 0; i < person.length; i++) {
            //return urls[i] != url ?404:500;
            if (person[i] == url && habit[i] == methodType) {
                return description[i];
            } else if (person[i] == url) {
                isUrlFound = true;
            }
        }

        return isUrlFound ? "405-method-not-allowed" : "404-not-found";
    }


}