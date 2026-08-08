package org.apache.shiro.spring.boot.faceid.realm;

import org.apache.shiro.biz.realm.AbstractAuthorizingRealm;
import org.apache.shiro.spring.boot.faceid.token.FaceIDLoginToken;

/**
 * Kisso Stateful AuthorizingRealm
 * @author [@Loong Wan](https://github.com/loong10k)
 */
public class FaceIDStatefulAuthorizingRealm extends AbstractAuthorizingRealm {

	@Override
	public Class<?> getAuthenticationTokenClass() {
		return FaceIDLoginToken.class;// 此Realm只支持KissoLoginToken
	}

}
