package team.idivision.samples.designpatterns.factory

import team.idivision.samples.designpatterns.patterns.Pattern
import team.idivision.samples.designpatterns.patterns.behavioral.chain_of_responsibility.ChainOfResponsibility
import team.idivision.samples.designpatterns.patterns.behavioral.command.Command
import team.idivision.samples.designpatterns.patterns.behavioral.iterator.Iterator
import team.idivision.samples.designpatterns.patterns.behavioral.mediator.Mediator
import team.idivision.samples.designpatterns.patterns.behavioral.moment.Momento
import team.idivision.samples.designpatterns.patterns.behavioral.observer.Observer
import team.idivision.samples.designpatterns.patterns.behavioral.state.State
import team.idivision.samples.designpatterns.patterns.behavioral.strategy.Strategy
import team.idivision.samples.designpatterns.patterns.behavioral.visitor.Visitor


class BehavioralPatternFactory : PatternFactory {

    override fun create(): List<Pattern> =
        listOf(
            ChainOfResponsibility(),
            Command(),
            Iterator(),
            Mediator(),
            Momento(),
            Observer(),
            State(),
            Strategy(),
            Visitor(),
        )
}