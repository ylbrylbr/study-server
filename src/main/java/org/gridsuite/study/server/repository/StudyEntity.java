/**
 * Copyright (c) 2020, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.gridsuite.study.server.repository;

import org.gridsuite.study.server.dto.LoadFlowStatus;

import java.util.UUID;

/**
 * @author Abdelsalem Hedhili <abdelsalem.hedhili at rte-france.com>
 */
public interface StudyEntity extends BasicStudyEntity {

    void setStudyName(String studyName);

    UUID getNetworkUuid();

    String getNetworkId();

    String getDescription();

    String getCaseFormat();

    UUID getCaseUuid();

    boolean isCasePrivate();

    boolean isPrivate();

    LoadFlowStatus getLoadFlowStatus();

    LoadFlowResultEntity getLoadFlowResult();

    UUID getSecurityAnalysisResultUuid();

    LoadFlowParametersEntity getLoadFlowParameters();
}
