/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeEdgeClusterAttachScriptsRequest extends RoaAcsRequest<DescribeEdgeClusterAttachScriptsResponse> {
	
	public DescribeEdgeClusterAttachScriptsRequest() {
		super("CS", "2015-12-15", "DescribeEdgeClusterAttachScripts");
		setUriPattern("/clusters/[ClusterId]/attachscript");
		setMethod(MethodType.GET);
	}

	private String clusterId;

	private String namePrefix;

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("ClusterId", clusterId);
		}
	}

	public String getNamePrefix() {
		return this.namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
		if(namePrefix != null){
			putQueryParameter("NamePrefix", namePrefix);
		}
	}

	@Override
	public Class<DescribeEdgeClusterAttachScriptsResponse> getResponseClass() {
		return DescribeEdgeClusterAttachScriptsResponse.class;
	}

}
