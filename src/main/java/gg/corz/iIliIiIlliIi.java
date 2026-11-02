package gg.corz;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class iIliIiIlliIi {
   private int IIlIIlIIllIlIIlIIl;
   private int liIIIlIIliiIIIlIIl;
   private final Map<String, Long> ilIIIlIIlIiIIIlIIl = new LinkedHashMap<>();

   public long lIiiIiIlilli(String name, long lifetimeNow) {
      return lifetimeNow - this.ilIIIlIIlIiIIIlIIl.getOrDefault(name, 0L);
   }

   public void IliIlllilIi(int lifetime, Map<String, Long> tick) {
      this.liIIIlIIliiIIIlIIl++;
      this.IIlIIlIIllIlIIlIIl = lifetime;
      this.ilIIIlIIlIiIIIlIIl.clear();
      this.ilIIIlIIlIiIIIlIIl.putAll(tick);
   }

   public String iliIiiliiiii(int tick, Map<String, Long> lifetime) {
      StringBuilder var3 = new StringBuilder(IIIllIIliIIl<"IIIllIIliIIl","ycH2+xaT1GkWewe9606mWjoU9hyc8jTtcR/EdY4lOeZez1i5Eo4=">())
         .append(this.liIIIlIIliiIIIlIIl)
         .append(IIIllIIliIIl<"IIIllIIliIIl","3LzgcrWIL7Y82XHRfYaIqD+8hIN5SB3Q2niCQwMPN5nxms8y4jJp9cAXaIk=">())
         .append(this.IIlIIlIIllIlIIlIIl < 0 ? 0 : (tick - this.IIlIIlIIllIlIIlIIl) / 20)
         .append('s');

      for (Entry var5 : lifetime.entrySet()) {
         String var6 = (String)var5.getKey();
         var3.append(IIIllIIliIIl<"IIIllIIliIIl","v4mfSzxlobodpMkTMbcYB2ElOtiMJFyrhWD4FElDbLHjPSLf">())
            .append(Character.toUpperCase(var6.charAt(0)))
            .append(var6.substring(1))
            .append('=')
            .append(this.lIiiIiIlilli(var6, (Long)var5.getValue()));
      }

      return var3.toString();
   }

   public boolean IilliliilIIi() {
      return this.IIlIIlIIllIlIIlIIl >= 0;
   }

   public iIliIiIlliIi() {
      this.IIlIIlIIllIlIIlIIl = -1;
   }

   public int iIlIlllllill() {
      return this.IIlIIlIIllIlIIlIIl;
   }

   public int liiiIIllIl() {
      return this.liIIIlIIliiIIIlIIl;
   }
}
