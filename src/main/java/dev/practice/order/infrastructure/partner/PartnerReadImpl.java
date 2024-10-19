package dev.practice.order.infrastructure.partner;

import org.springframework.stereotype.Component;

import dev.practice.order.domain.partner.Partner;
import dev.practice.order.domain.partner.PartnerReader;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PartnerReadImpl implements PartnerReader {

	private final PartnerRepository partnerRepository;
	@Override
	public Partner getPartner(String partnerToken) {
		partnerRepository.findByPartnerToken(partnerToken).orElseThrow(
			() -> new RuntimeException());
		return null;
	}
}
