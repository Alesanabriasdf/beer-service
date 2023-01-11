
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}