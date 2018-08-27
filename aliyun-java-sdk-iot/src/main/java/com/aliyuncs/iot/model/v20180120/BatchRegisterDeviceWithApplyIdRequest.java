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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class BatchRegisterDeviceWithApplyIdRequest extends RpcAcsRequest<BatchRegisterDeviceWithApplyIdResponse> {
	
	public BatchRegisterDeviceWithApplyIdRequest() {
		super("Iot", "2018-01-20", "BatchRegisterDeviceWithApplyId");
	}

	private Long applyId;

	private String productKey;

	public Long getApplyId() {
		return this.applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
		if(applyId != null){
			putQueryParameter("ApplyId", applyId.toString());
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	@Override
	public Class<BatchRegisterDeviceWithApplyIdResponse> getResponseClass() {
		return BatchRegisterDeviceWithApplyIdResponse.class;
	}

}
