/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. See accompanying LICENSE file.
 */

package org.apache.submarine.tony.rpc;

import org.apache.hadoop.ipc.ProtocolInfo;
import org.apache.submarine.tony.rpc.proto.TensorFlowCluster.TensorFlowClusterService;

@ProtocolInfo(protocolName = "org.apache.submarine.tony.rpc.TensorFlowCluster", protocolVersion = 1)
public interface TensorFlowClusterPB extends TensorFlowClusterService.BlockingInterface {
}
