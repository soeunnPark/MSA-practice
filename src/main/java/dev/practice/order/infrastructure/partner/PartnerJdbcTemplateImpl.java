package dev.practice.order.infrastructure.partner;

import org.springframework.stereotype.Component;

import dev.practice.order.domain.partner.Partner;
import dev.practice.order.domain.partner.PartnerReader;
import dev.practice.order.domain.partner.PartnerStore;

@Component
public class PartnerJdbcTemplateImpl implements PartnerReader, PartnerStore {
	@Override
	public Partner getPartner(String partnerToken) {
		return null;
	}

	@Override
	public Partner store(Partner initPartner) {
		return null;
	}
}
