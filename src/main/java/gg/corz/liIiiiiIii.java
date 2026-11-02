package gg.corz;

import java.util.Locale;

public record liIiiiiIii(
   int failureTick,
   long missionId,
   long missionRevision,
   long target,
   long stand,
   String actionType,
   String failureClass,
   String failureReason,
   long routeStart,
   long routeGoal,
   long geometryFingerprint,
   long tempAssetFingerprint,
   long componentKey,
   long worldRevision,
   int equivalentRepeatCount,
   boolean constraintPublished,
   String constraintKind,
   long constraintKey,
   String nextDecisionAfterFailure
) {
   private final int lIlIllIliIlIllIl;
   private final long IlIlllIlllIlllIl;
   private final String lliIllIliliIllIl;
   private final String lIilllIliIilllIl;
   private final long IllIllIllllIllIl;
   private final String iIiIllIlIliIllIl;
   private final String IiiIllIlliiIllIl;
   private final long iiiIllIlIIIlllIl;
   private final long liIlllIliiIlllIl;
   private final long lIIlllIliIIlllIl;
   private final int iIllllIlIlllllIl;
   private final long IIllllIllIllllIl;
   private final long lilIllIliilIllIl;
   private final boolean llllllIlilllllIl;
   private final long illIllIlIilIllIl;
   private final String IillllIllillllIl;
   private final long ilIlllIlIiIlllIl;
   private final long iillllIlIIilllIl;
   private final long IIiIllIllIiIllIl;

   public String IlIlllIlilIl() {
      return this.iIiIllIlIliIllIl;
   }

   public long iliIiiliiiii() {
      return this.lilIllIliilIllIl;
   }

   public long Iiilliiliiil() {
      return this.liIlllIliiIlllIl;
   }

   public long Iilllilliill() {
      return this.lIIlllIliIIlllIl;
   }

   public long IIIllIIliIIl() {
      return this.IIiIllIllIiIllIl;
   }

   public long Ililllililil() {
      return this.ilIlllIlIiIlllIl;
   }

   public int iIlIlllllill() {
      return this.lIlIllIliIlIllIl;
   }

   public String IIlllIlliIll() {
      return this.IiiIllIlliiIllIl;
   }

   public long IIillIiliIil() {
      return this.IlIlllIlllIlllIl;
   }

   public long IIIilIIiiIIi() {
      return this.IIllllIllIllllIl;
   }

   public String IiIlliIliiIl() {
      return this.lliIllIliliIllIl;
   }

   public String IIlilIliiIli() {
      return this.IillllIllillllIl;
   }

   public long Illillliilli() {
      return this.iillllIlIIilllIl;
   }

   public long Illlllllilll() {
      return this.iiiIllIlIIIlllIl;
   }

   public boolean IiIiliIiiiIi() {
      return this.llllllIlilllllIl;
   }

   public int IlIillIiilIi() {
      return this.iIllllIlIlllllIl;
   }

   public long lIiiIiIlilli() {
      return this.illIllIlIilIllIl;
   }

   public String Iilililiiili() {
      return this.lIilllIliIilllIl;
   }

   public long IilliliilIIi() {
      return this.IllIllIllllIllIl;
   }

   public boolean IliIlllilIi(liIiiiiIii o) {
      return o != null
         && this.lilIllIliilIllIl == o.lilIllIliilIllIl
         && this.IIiIllIllIiIllIl == o.IIiIllIllIiIllIl
         && this.iIiIllIlIliIllIl.equals(o.iIiIllIlIliIllIl)
         && this.IlIlllIlllIlllIl == o.IlIlllIlllIlllIl;
   }

   public liIiiiiIii(
      int failureTick,
      long missionId,
      long missionRevision,
      long target,
      long stand,
      String actionType,
      String failureClass,
      String failureReason,
      long routeStart,
      long routeGoal,
      long geometryFingerprint,
      long tempAssetFingerprint,
      long componentKey,
      long worldRevision,
      int equivalentRepeatCount,
      boolean constraintPublished,
      String constraintKind,
      long constraintKey,
      String nextDecisionAfterFailure
   ) {
      this.lIlIllIliIlIllIl = failureTick;
      this.IllIllIllllIllIl = missionId;
      this.illIllIlIilIllIl = missionRevision;
      this.lilIllIliilIllIl = target;
      this.IIiIllIllIiIllIl = stand;
      this.iIiIllIlIliIllIl = actionType;
      this.lliIllIliliIllIl = failureClass;
      this.IiiIllIlliiIllIl = failureReason;
      this.iiiIllIlIIIlllIl = routeStart;
      this.lIIlllIliIIlllIl = routeGoal;
      this.IlIlllIlllIlllIl = geometryFingerprint;
      this.ilIlllIlIiIlllIl = tempAssetFingerprint;
      this.liIlllIliiIlllIl = componentKey;
      this.IIllllIllIllllIl = worldRevision;
      this.iIllllIlIlllllIl = equivalentRepeatCount;
      this.llllllIlilllllIl = constraintPublished;
      this.IillllIllillllIl = constraintKind;
      this.iillllIlIIilllIl = constraintKey;
      this.lIilllIliIilllIl = nextDecisionAfterFailure;
   }

   public String liiiIIllIl() {
      return String.format(
         Locale.ROOT,
         IIiilIiiiIii<"IIiilIiiiIii","JxVxYslMh1ykL0qt41yT7JBslt11745eT4JZT0eYInk4QO/scPrjJa6kSgLlrns3yNc8Piy0ZpqHHUuBrRe80GkLf8XyWKy66iRhG7tDXm/RhsDlJL9064LpSINfoDmL6hMEbjsFcQL5TAYF">(),
         this.lIlIllIliIlIllIl,
         this.lilIllIliilIllIl,
         this.IIiIllIllIiIllIl,
         this.iIiIllIlIliIllIl,
         this.lliIllIliliIllIl,
         this.iIllllIlIlllllIl,
         this.llllllIlilllllIl ? this.IillllIllillllIl : IIiilIiiiIii<"IIiilIiiiIii","xNUuRZ3NLyhWqScVBg4aQvERNKhlXtEpuAdyDZHyQzs=">(),
         this.IiiIllIlliiIllIl
      );
   }
}
