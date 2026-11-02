package gg.corz;

import com.google.gson.JsonObject;
import java.util.Locale;

public record llliiiIiilliiiIi(
   String jobId, long leaseGeneration, int cellCount, int exactCount, int missingCount, int wrongCount, int unobservedCount, long worldRevision
) {
   private final int lliIiIIlIi;
   private final long liiIiIIlIi;
   private final int iliIiIIlIi;
   private final long lIiIiIIlIi;
   private final int iIiIiIIlIi;
   private final String IIiIiIIlIi;
   private final int IiiIiIIlIi;
   private final int IliIiIIlIi;

   public boolean IilliliilIIi() {
      return this.iIiIiIIlIi == 0;
   }

   public boolean IliIlllilIi() {
      return this.iIiIiIIlIi >= 0 && this.lliIiIIlIi == 0 && this.iliIiIIlIi == 0 && this.IiiIiIIlIi == 0 && this.IliIiIIlIi == this.iIiIiIIlIi;
   }

   public int Iiilliiliiil() {
      return this.IiiIiIIlIi;
   }

   public int lIiiIiIlilli() {
      return Math.max(0, this.IliIiIIlIi);
   }

   public int IIillIiliIil() {
      return this.lliIiIIlIi;
   }

   public int Iilllilliill() {
      return this.IliIiIIlIi;
   }

   public long IIlllIlliIll() {
      return this.lIiIiIIlIi;
   }

   public static llliiiIiilliiiIi IlIlllIlilIl(JsonObject o) {
      if (o != null
         && o.has(IlIillIiilIi<"IlIillIiilIi","6vWYmvEmP0EO6F6QrM9u9U98J4eWdZyz6CNlrhgcQA==">())
         && o.has(IlIillIiilIi<"IlIillIiilIi","7X9hUls1XBEZPphvYzR3bP62zkncrwTf3m4zR5gidP6u">())
         && o.has(IlIillIiilIi<"IlIillIiilIi","QYsEo6R50XVF51dCCX323U0JuNZP3I0XTw47nFkdlkYW">())) {
         try {
            return new llliiiIiilliiiIi(
               o.get(IlIillIiilIi<"IlIillIiilIi","6vWYmvEmP0EO6F6QrM9u9U98J4eWdZyz6CNlrhgcQA==">()).getAsString(),
               o.has(IlIillIiilIi<"IlIillIiilIi","K3gbRIvk3NQ7tQxLSI1Ud36Y+vriRzulnpmIfSn+wA==">())
                  ? o.get(IlIillIiilIi<"IlIillIiilIi","K3gbRIvk3NQ7tQxLSI1Ud36Y+vriRzulnpmIfSn+wA==">()).getAsLong()
                  : -1L,
               o.get(IlIillIiilIi<"IlIillIiilIi","7X9hUls1XBEZPphvYzR3bP62zkncrwTf3m4zR5gidP6u">()).getAsInt(),
               o.get(IlIillIiilIi<"IlIillIiilIi","QYsEo6R50XVF51dCCX323U0JuNZP3I0XTw47nFkdlkYW">()).getAsInt(),
               o.has(IlIillIiilIi<"IlIillIiilIi","Cct/CkcMddKHcZTvTgNtjm2qgt8QmpHVr9QrZyjGYnLZHA0=">())
                  ? o.get(IlIillIiilIi<"IlIillIiilIi","Cct/CkcMddKHcZTvTgNtjm2qgt8QmpHVr9QrZyjGYnLZHA0=">()).getAsInt()
                  : 0,
               o.has(IlIillIiilIi<"IlIillIiilIi","XUeqRlJTtQIMr9QLKQdalghVo6NdPmdhzKPpilyb6Gff">())
                  ? o.get(IlIillIiilIi<"IlIillIiilIi","XUeqRlJTtQIMr9QLKQdalghVo6NdPmdhzKPpilyb6Gff">()).getAsInt()
                  : 0,
               o.has(IlIillIiilIi<"IlIillIiilIi","DATith+/BKhqap9EaeNRQ7mfr013xplC0U0G4uNgD4kQ+w==">())
                  ? o.get(IlIillIiilIi<"IlIillIiilIi","DATith+/BKhqap9EaeNRQ7mfr013xplC0U0G4uNgD4kQ+w==">()).getAsInt()
                  : 0,
               o.has(IlIillIiilIi<"IlIillIiilIi","V6EmCe1WnCb3b/p+YnthPx7Y4HMmkwl1rhduM/eYhA==">())
                  ? o.get(IlIillIiilIi<"IlIillIiilIi","V6EmCe1WnCb3b/p+YnthPx7Y4HMmkwl1rhduM/eYhA==">()).getAsLong()
                  : 0L
            );
         } catch (Exception var2) {
            return null;
         }
      } else {
         return null;
      }
   }

   public int Illlllllilll() {
      return this.iIiIiIIlIi;
   }

   public String IiIlliIliiIl() {
      return this.IIiIiIIlIi;
   }

   public void IIIllIIliIIl(JsonObject o) {
      o.addProperty(IlIillIiilIi<"IlIillIiilIi","6vWYmvEmP0EO6F6QrM9u9U98J4eWdZyz6CNlrhgcQA==">(), this.IIiIiIIlIi);
      o.addProperty(IlIillIiilIi<"IlIillIiilIi","K3gbRIvk3NQ7tQxLSI1Ud36Y+vriRzulnpmIfSn+wA==">(), this.lIiIiIIlIi);
      o.addProperty(IlIillIiilIi<"IlIillIiilIi","7X9hUls1XBEZPphvYzR3bP62zkncrwTf3m4zR5gidP6u">(), this.iIiIiIIlIi);
      o.addProperty(IlIillIiilIi<"IlIillIiilIi","QYsEo6R50XVF51dCCX323U0JuNZP3I0XTw47nFkdlkYW">(), this.IliIiIIlIi);
      o.addProperty(IlIillIiilIi<"IlIillIiilIi","Cct/CkcMddKHcZTvTgNtjm2qgt8QmpHVr9QrZyjGYnLZHA0=">(), this.lliIiIIlIi);
      o.addProperty(IlIillIiilIi<"IlIillIiilIi","XUeqRlJTtQIMr9QLKQdalghVo6NdPmdhzKPpilyb6Gff">(), this.iliIiIIlIi);
      o.addProperty(IlIillIiilIi<"IlIillIiilIi","DATith+/BKhqap9EaeNRQ7mfr013xplC0U0G4uNgD4kQ+w==">(), this.IiiIiIIlIi);
      o.addProperty(IlIillIiilIi<"IlIillIiilIi","V6EmCe1WnCb3b/p+YnthPx7Y4HMmkwl1rhduM/eYhA==">(), this.liiIiIIlIi);
   }

   public String iliIiiliiiii() {
      return String.format(
         Locale.ROOT,
         IlIillIiilIi<"IlIillIiilIi","zvjunl6olfFt0HnyZ9gPm+CpJz2m8GXhJ9pJR/eFwK5GNhsRHn8Ma+gqBYpV4jjO/f+NkAjsK05ECUbwMTf2vpFxodM+FQg3Bg0JZ0RL3reCVsJfeBKe+CQA2bunqax4JT6FYqUUPyXJ+4dQ/ae0zXiYx2DqUENnlLRenZckRA==">(),
         this.IIiIiIIlIi,
         this.lIiIiIIlIi,
         this.iIiIiIIlIi,
         this.IliIiIIlIi,
         this.lliIiIIlIi,
         this.iliIiIIlIi,
         this.IiiIiIIlIi,
         this.liiIiIIlIi,
         this.IliIlllilIi()
            ? IlIillIiilIi<"IlIillIiilIi","eqNoAB/KkRLtVF2B0GL3Ilb3Xl9hPZTMVWIeeCKJtPIa2zC2">()
            : IlIillIiilIi<"IlIillIiilIi","5+bwN5K1w4Fx/al46t8Fh/oaC2jxgTP8XLOYDDzGxbJdgzk=">()
      );
   }

   public llliiiIiilliiiIi(
      String jobId, long leaseGeneration, int cellCount, int exactCount, int missingCount, int wrongCount, int unobservedCount, long worldRevision
   ) {
      this.IIiIiIIlIi = jobId;
      this.lIiIiIIlIi = leaseGeneration;
      this.iIiIiIIlIi = cellCount;
      this.IliIiIIlIi = exactCount;
      this.lliIiIIlIi = missingCount;
      this.iliIiIIlIi = wrongCount;
      this.IiiIiIIlIi = unobservedCount;
      this.liiIiIIlIi = worldRevision;
   }

   public boolean liiiIIllIl() {
      return this.IiiIiIIlIi == 0;
   }

   public boolean iIlIlllllill(String expectedJobId, int expectedGeneration, long expectedCellCount) {
      return this.IIiIiIIlIi != null
         && this.IIiIiIIlIi.equals(expectedJobId)
         && this.iIiIiIIlIi == expectedGeneration
         && this.lIiIiIIlIi == expectedCellCount
         && this.IliIlllilIi();
   }

   public long IIIilIIiiIIi() {
      return this.liiIiIIlIi;
   }

   public int Ililllililil() {
      return this.iliIiIIlIi;
   }

   public llliiiIiilliiiIi(String jobId, long cellCount, int leaseGeneration, int wrongCount, int exactCount, int worldRevision, long missingCount) {
      this(jobId, cellCount, leaseGeneration, wrongCount, exactCount, worldRevision, 0, missingCount);
   }
}
