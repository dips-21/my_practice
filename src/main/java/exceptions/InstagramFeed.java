package exceptions;

public class InstagramFeed {
    String user;
    Configuration configuration;

    public InstagramFeed(String user, Configuration configuration) {
        this.user = user;
        this.configuration = configuration;
    }

    String getPost(String ofUser)throws UnAuthorizedException {
        if (!configuration.hasPermission(user, ofUser)) {
           // throw new UnAuthorizedException("403", "user " + user + " is not authorized to view" + ofUser);
            throw new UnAuthorizedException("Interview is bakwas","Nonsense");
        }
        return "feeds";
    }
}
