package com.revature.main.model;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "nps_nfts")
@NoArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode @AllArgsConstructor
public class NFT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nft_symbol")
    private String symbol;

    @Column(name = "nft_contract_address", unique=true)
    private String contractAddress;

    @Column(name = "nft_name")
    private String name;

    @Column(name = "nft_token_id")
    private String tokenId;

    @Column(name = "nft_owner")
    private Long owner;

    @Column(name = "nft_token_uri")
    private String tokenUri;

    @JoinColumn(name = "nps_image")
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Image image;

}
