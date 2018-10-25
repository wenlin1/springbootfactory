package cn.wl.singleton;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class SpringSingleton extends AbstractBeanFactory {

    @Override protected boolean containsBeanDefinition(String s) {

        return false;
    }

    @Override protected BeanDefinition getBeanDefinition(String s) throws BeansException {

        return null;
    }

    @Override protected Object createBean(String s, RootBeanDefinition rootBeanDefinition, Object[] objects)
        throws BeanCreationException {

        return null;
    }

    @Override public <T> T getBean(Class<T> aClass) throws BeansException {

        return null;
    }

    @Override public <T> T getBean(Class<T> aClass, Object... objects) throws BeansException {

        return null;
    }
}
