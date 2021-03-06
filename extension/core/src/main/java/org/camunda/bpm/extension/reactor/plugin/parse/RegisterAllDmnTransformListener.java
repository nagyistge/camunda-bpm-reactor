package org.camunda.bpm.extension.reactor.plugin.parse;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionRequirementsGraph;
import org.camunda.bpm.dmn.engine.impl.DmnDecisionTableInputImpl;
import org.camunda.bpm.dmn.engine.impl.DmnDecisionTableOutputImpl;
import org.camunda.bpm.dmn.engine.impl.DmnDecisionTableRuleImpl;
import org.camunda.bpm.dmn.engine.impl.spi.transform.DmnTransformListener;
import org.camunda.bpm.model.dmn.instance.Decision;
import org.camunda.bpm.model.dmn.instance.Definitions;
import org.camunda.bpm.model.dmn.instance.Input;
import org.camunda.bpm.model.dmn.instance.Output;
import org.camunda.bpm.model.dmn.instance.Rule;

public class RegisterAllDmnTransformListener implements DmnTransformListener {

  @Override
  public void transformDecision(Decision decision, DmnDecision dmnDecision) {

  }

  @Override
  public void transformDecisionTableInput(Input input, DmnDecisionTableInputImpl tableInput) {

  }

  @Override
  public void transformDecisionTableOutput(Output output, DmnDecisionTableOutputImpl tableOutput) {

  }

  @Override
  public void transformDecisionTableRule(Rule rule, DmnDecisionTableRuleImpl tableRule) {

  }

  @Override
  public void transformDecisionRequirementsGraph(Definitions definitions, DmnDecisionRequirementsGraph graph) {

  }
}
