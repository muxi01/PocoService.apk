package com.netease.open.pocoservice.sdk;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by adolli on 2017/7/12.
 */

public interface ISelector <NodeType> {

    NodeType[] select(JSONArray cond, boolean multiple);

}
