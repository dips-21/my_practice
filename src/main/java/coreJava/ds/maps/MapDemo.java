package coreJava.ds.maps;

//question ,DELETE
public class MapDemo {
    String[] urls = {"/question", "/question", "/exam", "/exam", "/score", "/score", "/score"};
    String[] method = {"GET", "POST", "GET", "DELETE", "GET", "PUT", "DELETE"};
    String[] methodNames = {"qstnController.getQsts()", "qstnController.save", "examController.get()",
            "examController.End()", "score_get", "score_put", "score_delete()"};

    String getRequestMapping(String url, String methodType) {
        //if (urls[i] != url)  return 404
        boolean isUrlFound = false;
        for (int i = 0; i < urls.length; i++) {
            //return urls[i] != url ?404:500;
            if (urls[i] == url && method[i] == methodType) {
                return methodNames[i];
            }
            if (urls[i] == url)
                isUrlFound = true;    //question   get            / exam post       question delete
        }
       // return "404-url-not-present";
       if(isUrlFound)
           return "405-method-not-found";
         return "404-url-not-found";
    }
}

