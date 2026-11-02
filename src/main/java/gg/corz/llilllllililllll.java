package gg.corz;

import java.util.UUID;

public record llilllllililllll(UUID id, String subject, String detail, int score, boolean alert, long expiresAt) {
   private final boolean iIliIiIill;
   private final int lIliIiIill;
   private final long IlliIiIill;
   private final UUID liIiIiIill;
   private final String IIliIiIill;
   private final String iiIiIiIill;

   public boolean lIiiIiIlilli() {
      return this.iIliIiIill;
   }

   public int IilliliilIIi() {
      return this.lIliIiIill;
   }

   public String iIlIlllllill() {
      return this.IIliIiIill;
   }

   public UUID IliIlllilIi() {
      return this.liIiIiIill;
   }

   public String liiiIIllIl() {
      return this.iiIiIiIill;
   }

   public llilllllililllll(UUID id, String subject, String detail, int score, boolean alert, long expiresAt) {
      this.liIiIiIill = id;
      this.iiIiIiIill = subject;
      this.IIliIiIill = detail;
      this.lIliIiIill = score;
      this.iIliIiIill = alert;
      this.IlliIiIill = expiresAt;
   }

   public long iliIiiliiiii() {
      return this.IlliIiIill;
   }
}
