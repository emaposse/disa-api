/**
 *
 */
package mz.org.fgh.disaapi.core.viralload.service;

import java.util.List;

import mz.co.msaude.boot.frameworks.exception.BusinessException;
import mz.org.fgh.disaapi.core.viralload.model.ViralLoad;

/**
 * @author Stélio Moiane
 *
 */
public interface ViralLoadQueryService {

	List<ViralLoad> findAllViralLoad() throws BusinessException;

}
