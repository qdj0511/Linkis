/*
 * Copyright 2019 WeBank
 *
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

package com.webank.wedatasphere.linkis.manager.am.pointer

import com.webank.wedatasphere.linkis.manager.common.entity.node.{EMNode, EngineNode}
import com.webank.wedatasphere.linkis.manager.service.common.pointer.{EMNodPointer, EngineNodePointer, NodePointerBuilder}
import org.springframework.stereotype.Component

/**
  * @date 2020/7/13 20:09
  */
@Component
class DefaultNodePointerBuilder extends NodePointerBuilder {


  override def buildEMNodePointer(node: EMNode): EMNodPointer = {
    new DefaultEMNodPointer(node)
  }

  override def buildEngineNodePointer(node: EngineNode): EngineNodePointer = {
    new DefaultEngineNodPointer(node)
  }

}