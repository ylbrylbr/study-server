/**
 * Copyright (c) 2020, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.gridsuite.study.server.dto;

import com.powsybl.loadflow.LoadFlowResult;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Abdelsalem Hedhili <abdelsalem.hedhili at rte-france.com>
 */
@SuperBuilder
@NoArgsConstructor
@Getter
@ApiModel("Study attributes")
public class StudyInfos extends BasicStudyInfos {

    String description;

    String caseFormat;

    LoadFlowStatus loadFlowStatus;

    LoadFlowResult loadFlowResult;

    boolean studyPrivate;
}
