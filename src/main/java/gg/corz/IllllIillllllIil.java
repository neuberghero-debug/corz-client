package gg.corz;

import java.util.Set;

public record IllllIillllllIil(
   String id,
   ilIIlIliIiIIlIli role,
   boolean settingsLocal,
   Set<String> local,
   Set<String> validate,
   Set<String> portable,
   String sinkReview,
   String portableReview
) {
   private final String lIlIiIlIil;
   private final Set<String> liIIiIlIil;
   private final boolean ilIIiIlIil;
   private final ilIIlIliIiIIlIli llIIiIlIil;
   private final String IlIIiIlIil;
   private final Set<String> IiIIiIlIil;
   private final String IIlIiIlIil;
   private final Set<String> iiIIiIlIil;

   public IllllIillllllIil(
      String id,
      ilIIlIliIiIIlIli role,
      boolean settingsLocal,
      Set<String> local,
      Set<String> validate,
      Set<String> portable,
      String sinkReview,
      String portableReview
   ) {
      this.IlIIiIlIil = id;
      this.llIIiIlIil = role;
      this.ilIIiIlIil = settingsLocal;
      this.IiIIiIlIil = local;
      this.liIIiIlIil = validate;
      this.iiIIiIlIil = portable;
      this.IIlIiIlIil = sinkReview;
      this.lIlIiIlIil = portableReview;
   }

   public ilIIlIliIiIIlIli liiiIIllIl() {
      return this.llIIiIlIil;
   }

   public Set<String> lIiiIiIlilli() {
      return this.liIIiIlIil;
   }

   public String IIIllIIliIIl() {
      return this.IIlIiIlIil;
   }

   public Set<String> iliIiiliiiii() {
      return this.iiIIiIlIil;
   }

   public boolean iIlIlllllill() {
      return this.ilIIiIlIil;
   }

   public String IlIlllIlilIl() {
      return this.lIlIiIlIil;
   }

   public Set<String> IilliliilIIi() {
      return this.IiIIiIlIil;
   }

   public String IliIlllilIi() {
      return this.IlIIiIlIil;
   }
}
