package entity;

import com.jme.scene.Node;
import phys.Motion;
import phys.Shape;

import java.util.HashMap;

public class EntityFactory {

    private static final HashMap<String, Skeleton01> skeletonMap = new HashMap();

    public static Skeleton01 getSkeleton(String id, Node protoNode, Blood[] bloods, Explosion explode,
                                         Shape shape, Motion motion) {
        Skeleton01 skeleton = skeletonMap.get(id);

        if(skeleton == null) {
            skeleton = new Skeleton01(id, protoNode, bloods, explode, shape, motion);
            skeletonMap.put(id, skeleton);
        }

        skeleton.reset();
        return skeleton;
    }
}
