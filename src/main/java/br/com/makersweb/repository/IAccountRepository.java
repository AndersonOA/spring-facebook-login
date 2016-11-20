/* 
 * 
 * 2016 All Rights Reserved MakersWeb.
 * 
 */
package br.com.makersweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.makersweb.domain.Account;

/**
 *
 * @author Anderson O. Aristides
 * @created 20/11/2016
 *
 */
public interface IAccountRepository extends JpaRepository<Account, Long> {

	Account findAccountByUserName(String userName);
}
