package gg.corz;

import java.util.Map;
import java.util.Objects;

public record iiiiIiIlIIIIliIl(String blockId, Map<String, String> protectedState) {
   private final Map<String, String> IllIiliIll;
   private final String iIlIiliIll;

   public iiiiIiIlIIIIliIl(String blockId, Map<String, String> protectedState) {
      blockId = Objects.requireNonNull(blockId, iIlIlllllill<"iIlIlllllill","yG4FqRjby9NuLIORF6eqDMZY0Ny+xRPTCTc3RzS2x4sQ4w4=">());
      protectedState = Map.copyOf(protectedState == null ? Map.of() : protectedState);
      this.iIlIiliIll = blockId;
      this.IllIiliIll = protectedState;
   }

   public Map<String, String> liiiIIllIl() {
      return this.IllIiliIll;
   }

   public String IliIlllilIi() {
      return this.iIlIiliIll;
   }
}
