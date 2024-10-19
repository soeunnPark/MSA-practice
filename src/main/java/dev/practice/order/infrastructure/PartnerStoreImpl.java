package dev.practice.order.infrastructure;

import org.springframework.stereotype.Component;

import dev.practice.order.domain.partner.Partner;
import dev.practice.order.domain.partner.PartnerStore;
import dev.practice.order.infrastructure.partner.PartnerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class PartnerStoreImpl implements PartnerStore {

	private final PartnerRepository partnerRepository;

	@Override
	public Partner store(Partner initPartner) {
		return null;
	}
}
