package cn.bugstack.domain.strategy.service.rule.chain;

/**
 * @program: big-market-231202-xfg-init-project
 * @description:
 * @author: Merist
 * @create: 2025-07-17 09:55
 **/
public abstract class AbstractLogicChain implements ILogicChain{
    private ILogicChain next;

    @Override
    public ILogicChain appendNext(ILogicChain next){
        this.next = next;
        return next;
    }

    @Override
    public ILogicChain next(){
        return next;
    }

    protected abstract String ruleModel();
}
