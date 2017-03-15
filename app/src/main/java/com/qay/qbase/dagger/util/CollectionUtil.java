package com.qay.qbase.dagger.util;
import java.util.Collection;
/**
 * Created by dell on 2016/8/12.
 */
public class CollectionUtil {
    /**
     * 判断集合是否为空
     *
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection<? extends Object> collection) {
        boolean isEmpty = true;
        if (collection != null && !collection.isEmpty()) {
            isEmpty = false;
        }
        return isEmpty;
    }
}
