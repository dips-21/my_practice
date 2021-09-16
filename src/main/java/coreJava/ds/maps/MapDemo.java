package coreJava.ds.maps;

//question ,DELETE
public class MapDemo {
    String[] urls = {"/question", "/question", "/exam", "/exam", "/score", "/score", "/score"};
    String[] method = {"GET", "POST", "GET", "DELETE", "GET", "PUT", "DELETE"};
    String[] methodNames = {"qstnController.getQsts()", "qstnController.save", "examController.get()",
            "examController.End()", "score_get", "score_put", "score_delete()"};

    public static void main(String[] args) {
    }

    String getRequestMapping(String url, String methodType) {
        //if (urls[i] != url)  return 404

        boolean isUrlFound = false;

        for (int i = 0; i < urls.length; i++) {
            //return urls[i] != url ?404:500;
            if (urls[i] == url && method[i] == methodType) {
                return methodNames[i];
            }
            return "405-method-not-allowed";
        }

    }

}

