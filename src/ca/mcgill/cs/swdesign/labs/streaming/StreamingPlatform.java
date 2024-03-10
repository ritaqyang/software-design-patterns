package ca.mcgill.cs.swdesign.labs.streaming;

import java.util.ArrayList;
import java.util.List;


//todo: make it so that one instance of the streaming platform can be created
//todo: create findEntertainment using strategy design pattern
public class StreamingPlatform {

    private static StreamingPlatform instance;
    private List<Entertainment> aEntertainmentList = new ArrayList<>();

    public static StreamingPlatform getInstance(){
        if (instance == null){
            instance = new StreamingPlatform();

        }
        return instance;
    }

    public void addEntertainmentToPlatform(Entertainment pEntertainment){
        assert pEntertainment != null;
        aEntertainmentList.add(pEntertainment);
    }

    public void removeEntertainmentFromPlatform(Entertainment pEntertainment){
        assert pEntertainment != null;
        if (aEntertainmentList.contains(pEntertainment)) {
            aEntertainmentList.remove(pEntertainment);
        }
    }

    //todo: findEntertainment can find movies / tv by director or by genre

    public List<Entertainment> findEntertainment( String searchString, Filter f){

        List<Entertainment> result  = new ArrayList<>();

        for (Entertainment e : aEntertainmentList){
            if (f.filter(searchString, e)){
                result.add(e);
            }
        }
        return result;

    }


}
