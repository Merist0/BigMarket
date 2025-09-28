package cn.bugstack.domain.activity.service.quota.rule;


/**
 * @program: big-market-231202-xfg-init-project
 * @description: 下单规则责任链抽奖类
 * @author: Merist
 * @create: 2025-08-02 10:05
 **/
public abstract class AbstractActionChain implements IActionChain{
    private IActionChain next;

    @Override
    public IActionChain next(){
        return next;
    }

    @Override
    public IActionChain appendNext(IActionChain next){
        this.next = next;
        return next;
    }
}
