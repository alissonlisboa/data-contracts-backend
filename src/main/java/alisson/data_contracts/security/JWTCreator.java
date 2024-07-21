package alisson.data_contracts.security;
//
//import io.jsonwebtoken.*;
//import io.jsonwebtoken.security.Keys;
//import io.jsonwebtoken.security.SecureDigestAlgorithm;
//
//import javax.crypto.SecretKey;
//import javax.crypto.spec.SecretKeySpec;
//import java.security.Key;
//import java.security.SignatureException;
//import java.time.ZoneId;
//import java.util.Base64;
//import java.util.Date;
//import java.util.List;
//
public class JWTCreator {
//    public static final String HEADER_AUTHORIZATION = "Authorization";
//    public static final String ROLES_AUTHORITIES = "authorities";
//
//    public static String create(String prefix, String key, JWTObject jwtObject) {
//        byte[] keyBytes = Base64.getDecoder().decode(key);
//        String token = Jwts.builder()
//                .subject(jwtObject.getSubject())
//                .issuedAt(jwtObject.getIssuedAt())
//                .expiration(jwtObject.getExpiration())
//                .claim(ROLES_AUTHORITIES, checkRoles(jwtObject.getRoles())).signWith(Keys.hmacShaKeyFor(keyBytes))
//                .compact();
//
//        return prefix + " " + token;
//    }
//
//    public static JWTObject create(String token, String prefix, String key)
//        throws ExpiredJwtException, UnsupportedJwtException, MalformedJwtException {
//        SecretKey secretKey = Keys.hmacShaKeyFor(Base64.getDecoder().decode(key));
//        JWTObject object = new JWTObject();
//        token = token.replace(prefix, "");
//
//        Claims claims = Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token).getPayload();
//        object.setSubject(claims.getSubject());
//        object.setExpiration(claims.getExpiration());
//        object.setIssuedAt(claims.getIssuedAt());
//        object.setRoles((List) claims.get(ROLES_AUTHORITIES));
//        return object;
//    }
//
//    private static List<String> checkRoles(List<String> roles) {
//        return roles.stream()
//                .map(s -> "ROLE_".concat(s.replaceAll("ROLE_", "")))
//                .toList();
//    }
}