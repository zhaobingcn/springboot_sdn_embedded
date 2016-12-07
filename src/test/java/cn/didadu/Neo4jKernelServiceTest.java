package cn.didadu;

import cn.didadu.neo4jkernel.ExpanderService;
import cn.didadu.neo4jkernel.LoopDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhangjing on 16-7-21.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringbootSdnEmbeddedApplication.class)
public class Neo4jKernelServiceTest {

    @Autowired
    private  LoopDataService loopDataService;

    @Autowired
    private ExpanderService expanderService;

    @Test
    public void testFindJohnSeenMovie(){
        loopDataService.findJohnSeenMovie(0l);
    }

    @Test
    public void testRecommendMovieToJohn(){
        loopDataService.recommendMovieToJohn(0l);
    }

    @Test
    public void testLoopDataByApi(){
        loopDataService.loopDataByLoopApi(0l);
    }

    @Test
    public void testOrderedExpander(){
        expanderService.orderedExpander(1l);
    }
}
